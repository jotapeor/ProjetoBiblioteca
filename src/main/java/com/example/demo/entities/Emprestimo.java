package com.example.demo.entities;

import java.time.Instant;

public class Emprestimo {
    private Long id;
    private Instant dataEmprestimo;
    private Instant dataDevolucaoPrevista;
    private Instant dataDevolucaoReal;
    private String status;
    private String livro;
    private String usuario;
}
