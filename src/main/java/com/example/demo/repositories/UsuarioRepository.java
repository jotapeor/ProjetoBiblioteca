package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <com.example.demo.entities.Usuario, Long> {
}
