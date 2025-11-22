package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Funcionario {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long matricula;
    private String cargo;
    private Instant dataAdmissao;
    private Long salario;

    public Funcionario() {}

    public Funcionario(Long id, String nome, Long matricula, String cargo, Instant dataAdmissao, Long salario) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
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
    public Long getMatricula() {
        return matricula;
    }
    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Instant getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(Instant dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public Long getSalario() {
        return salario;
    }
    public void setSalario(Long salario) {
        this.salario = salario;
    }
}
