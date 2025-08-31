package com.example.demo.service;

import com.example.demo.exception.InvalidCPFException;
import com.example.demo.model.ApiResponse;
import com.example.demo.model.CPFModel;
import com.example.demo.repository.CPFRespository;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CPFService {

    private final WebClient webClient;
    private final CPFRespository respository;
    private final Logger logger = org.apache.logging.log4j.LogManager.getLogger(CPFService.class);

    @Value("${api.token}")
    private String TOKEN;

    public CPFService(WebClient.Builder webClientBuilder, CPFRespository respository){
        this.webClient = webClientBuilder.baseUrl("https://api.invertexto.com/v1/validator").build();
        this.respository = respository;
    }

    public Mono<ApiResponse> validateCPF(String cpf){
        return Mono.defer(() -> {
            logger.info("Consultando banco de dados");
            Optional<CPFModel> cpfExiste = respository.findByCpf(cpf);
            if(cpfExiste.isPresent()){
                logger.info("CPF encontrado");
                CPFModel model = cpfExiste.get();
                return Mono.just(new ApiResponse(model));
            }

        return this.webClient.get()
                .uri("?token={token}&value={cpf}&type=cpf", TOKEN, cpf)
                .retrieve()
                .onStatus(HttpStatusCode::isError, response ->
                    Mono.error(new Exception("Erro ao acessar a API externa: " + response.statusCode())))
                .bodyToMono(ApiResponse.class)
                .flatMap(apiResponse -> {
                    if(apiResponse.getValid()){
                        CPFModel cpfValido = new CPFModel(cpf, apiResponse.getValid(), apiResponse.getFormatted(), LocalDateTime.now());
                        respository.save(cpfValido);
                        logger.info("Novo CPF salvo no banco de dados");
                        return Mono.just(apiResponse);
                    } else{
                        return Mono.error(new InvalidCPFException("Por favor, verifique se o CPF foi digitado corretamente!"));
                    }
                });
        });
    }
}
