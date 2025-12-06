package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Livro {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String editora;
    private Instant anoPublicacao;
    private Long isbn;
    private String genero;
    private Long quantidadeExemplares;
    private String exemplaresDisponiveis;

    public Livro() {}

    public Livro(Long id, String titulo, String autor, String editora, Instant anoPublicacao, Long isbn, String genero, Long quantidadeExemplares, String exemplaresDisponiveis) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.genero = genero;
        this.quantidadeExemplares = quantidadeExemplares;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public Instant getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(Instant anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public Long getIsbn() {
        return isbn;
    }
    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Long getQuantidadeExemplares() {
        return quantidadeExemplares;
    }
    public void setQuantidadeExemplares(Long quantidadeExemplares) {
        this.quantidadeExemplares = quantidadeExemplares;
    }
    public String getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }
    public void setExemplaresDisponiveis(String exemplaresDisponiveis) {this.exemplaresDisponiveis = exemplaresDisponiveis;}
}