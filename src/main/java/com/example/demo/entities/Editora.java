package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Editora {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long cnpj;
    private String endereco;
    private Long telefone;

    public Editora() {}

    public Editora(Long id, String nome, Long cnpj, String endereco, Long telefone) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
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
    public Long getCnpj() {
        return cnpj;
    }
    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Long getTelefone() {
        return telefone;
    }
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
}