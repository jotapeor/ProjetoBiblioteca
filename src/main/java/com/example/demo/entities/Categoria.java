package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Categoria {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String livros;

    public Categoria() {}

    public Categoria(Long id, String nome, String descricao, String livros) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.livros = livros;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getLivros() {
        return livros;
    }
    public void setLivros(String livros) {
        this.livros = livros;
    }
}