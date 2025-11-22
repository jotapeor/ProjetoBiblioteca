package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Emprestimo {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant dataEmprestimo;
    private Instant dataDevolucaoPrevista;
    private Instant dataDevolucaoReal;
    private String status;
    private String livro;
    private String usuario;

    public Emprestimo() {}

    public Emprestimo(Long id, Instant dataEmprestimo, Instant dataDevolucaoPrevista, Instant dataDevolucaoReal, String status, String livro, String usuario) {
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucaoReal = dataDevolucaoReal;
        this.status = status;
        this.livro = livro;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Instant getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(Instant dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public Instant getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }
    public void setDataDevolucaoPrevista(Instant dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }
    public Instant getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }
    public void setDataDevolucaoReal(Instant dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getLivro() {
        return livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
