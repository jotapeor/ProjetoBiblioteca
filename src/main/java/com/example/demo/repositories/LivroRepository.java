package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository <com.example.demo.entities.Livro, Long> {
}
