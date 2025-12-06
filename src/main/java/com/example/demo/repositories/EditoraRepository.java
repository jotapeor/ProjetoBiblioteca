package com.example.demo.repositories;

import com.example.demo.entities.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoraRepository extends JpaRepository <Editora, Long> {
}
