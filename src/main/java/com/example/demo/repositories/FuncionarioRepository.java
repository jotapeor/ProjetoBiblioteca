package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <com.example.demo.entities.Funcionario, Long> {
}
