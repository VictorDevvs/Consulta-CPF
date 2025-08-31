# 🔍 Validador de CPF com Spring Boot + WebClient + Banco de Dados

Este projeto é uma **API REST** desenvolvida em **Spring Boot** que valida CPFs através de uma **API externa** 
([Invertexto Validator](https://api.invertexto.com/)) e armazena os resultados em um **banco de dados**.  

Assim, em consultas posteriores o sistema verifica se o CPF já foi consultado antes e retorna diretamente do banco,
evitando chamadas desnecessárias à API externa. 🚀

---

## ⚙️ Tecnologias utilizadas
- **Java 21**
- **Spring Boot 3.5.5**
- **Spring WebFlux (WebClient)**
- **Spring Data JPA**
- **H2 Database** (pode trocar para PostgreSQL/MySQL facilmente)
- **Log4j2** para logging
- **Maven**

---

# 📡 Endpoints disponíveis
GET /validator/cpf?cpf=12345678900

### Exemplo de resposta (CPF válido)
```json
{
  "valid": true,
  "formatted": "123.456.789-00"
}
```
### Exemplo de resposta (CPF inválido):
```json
{
  "title": "CPF inválido",
  "message": "Por favor, verifique se o CPF foi digitado corretamente!",
  "statusCode": 400,
  "valid": false,
  "timestamp": "2025-08-31T10:15:30"
}
```
