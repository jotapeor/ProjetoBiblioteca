package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Autor {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nacionalidade;
    private Instant dataNascimento;
    private String biografia;

    public Autor() {}

    public Autor(Long id, String nome, String nacionalidade, Instant dataNascimento, String biografia) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
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
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public Instant getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Instant dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getBiografia() {
        return biografia;
    }
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}

