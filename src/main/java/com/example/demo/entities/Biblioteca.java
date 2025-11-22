package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Biblioteca {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private Long telefone;
    private String listaDeLivros;
    private String listaDeUsuarios;
    private String funcionarios;

    public Biblioteca() {}

    public Biblioteca(Long id, String nome, String endereco, Long telefone, String listaDeLivros, String listaDeUsuarios, String funcionarios) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.listaDeLivros = listaDeLivros;
        this.listaDeUsuarios = listaDeUsuarios;
        this.funcionarios = funcionarios;
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
    public String getListaDeLivros() {
        return listaDeLivros;
    }
    public void setListaDeLivros(String listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }
    public String getListaDeUsuarios() {
        return listaDeUsuarios;
    }
    public void setListaDeUsuarios(String listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }
    public String getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }
}
