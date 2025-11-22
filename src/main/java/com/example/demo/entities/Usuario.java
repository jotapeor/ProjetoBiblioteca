package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Usuario {
    @Id
    @Column (length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long cpf;
    private String endereco;
    private Long telefone;
    private String email;
    private Instant dataCadastro;
    private Long emprestimosAtivos;

    public Usuario() {}

    public Usuario(Long id, String nome, Long cpf, String endereco, Long telefone, String email, Instant dataCadastro, Long emprestimosAtivos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.emprestimosAtivos = emprestimosAtivos;
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
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Instant getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Instant dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public Long getEmprestimosAtivos() {
        return emprestimosAtivos;
    }
    public void setEmprestimosAtivos(Long emprestimosAtivos) {
        this.emprestimosAtivos = emprestimosAtivos;
    }
}
