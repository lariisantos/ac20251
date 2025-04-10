package br.edu.cs.poo.ac.seguro.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SeguradoEmpresa extends Segurado {
    private String cnpj;
    private double faturamento;
    private boolean ehLocadoraDeVeiculos;

    // CONSTRUTOR

    public SeguradoEmpresa(String nome, Endereco endereco, LocalDate dataAbertura, BigDecimal bonus, String cnpj, double faturamento, boolean ehLocadoraDeVeiculos) {
        super(nome, endereco, dataAbertura, bonus);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
        this.ehLocadoraDeVeiculos = ehLocadoraDeVeiculos;
    }

    // MÉTODOS GETTERS & SETTERS

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public boolean isEhLocadoraDeVeiculos() {
        return ehLocadoraDeVeiculos;
    }

    public void setEhLocadoraDeVeiculos(boolean ehLocadoraDeVeiculos) {
        this.ehLocadoraDeVeiculos = ehLocadoraDeVeiculos;
    }

    // Metodo público LocalDate getDataAbertura(), que retorna a data de criação.

    public LocalDate getDataAbertura() {
        return getDataCriacao();
    }

    // Metodo público void setDataAbertura(LocalDate dataAbertura), que altera a data de criação.

    public void setDataAbertura(LocalDate dataAbertura) {
        setDataCriacao(dataAbertura);
    }
}