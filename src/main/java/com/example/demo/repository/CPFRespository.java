package com.example.demo.repository;

import com.example.demo.model.CPFModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CPFRespository extends JpaRepository<CPFModel, Long> {
    Optional<CPFModel> findByCpf(String cpf);
}
