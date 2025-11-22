package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Multa {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valor;
    private Instant dataGeracao;
    private String motivo;
    private String pago;

    public Multa() {}

    public Multa(Long id, Double valor, Instant dataGeracao, String motivo, String pago) {
        this.id = id;
        this.valor = valor;
        this.dataGeracao = dataGeracao;
        this.motivo = motivo;
        this.pago = pago;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Instant getDataGeracao() {
        return dataGeracao;
    }
    public void setDataGeracao(Instant dataGeracao) {
        this.dataGeracao = dataGeracao;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getPago() {
        return pago;
    }
    public void setPago(String pago) {
        this.pago = pago;
    }
}
