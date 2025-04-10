package br.edu.cs.poo.ac.seguro.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Segurado {

    private String nome;
    private Endereco endereco;
    private LocalDate dataCriacao;
    private BigDecimal bonus;

    // Construtor público que inicializa todos os atributos
    public Segurado(String nome, Endereco endereco, LocalDate dataCriacao, BigDecimal bonus) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataCriacao = dataCriacao;
        this.bonus = bonus;
    }

    // Métodos públicos set/get para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Métodos públicos set/get para endereço
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    // Métodos protegidos set/get para dataCriacao
    protected void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    protected LocalDate getDataCriacao() {
        return dataCriacao;
    }

    // Método público get para bônus
    public BigDecimal getBonus() {
        return bonus;
    }

    // Método público que calcula idade em anos
    public int getIdade() {
        if (dataCriacao == null) {
            return 0;
        }
        return Period.between(dataCriacao, LocalDate.now()).getYears();
    }

    // Método público para creditar bônus
    public void creditarBonus(BigDecimal valor) {
        if (valor != null) {
            bonus = bonus.add(valor);
        }
    }

    // Método público para debitar bônus
    public void debitarBonus(BigDecimal valor) {
        if (valor != null) {
            bonus = bonus.subtract(valor);
        }
    }
}
