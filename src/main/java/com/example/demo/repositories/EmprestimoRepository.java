package com.example.demo.repositories;

import com.example.demo.entities.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository <Emprestimo, Long> {
}
