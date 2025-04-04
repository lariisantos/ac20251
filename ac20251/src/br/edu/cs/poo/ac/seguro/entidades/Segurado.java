package br.edu.cs.poo.ac.seguro.entidades;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Segurado {
    private String nome;
    private Endereco endereco;
    private LocalDate dataCriacao;
    private BigDecimal bonus;

    public Segurado(String nome, Endereco endereco, LocalDate dataCriacao, BigDecimal bonus){
        this.nome = nome;
        this.endereco = endereco;
        this.dataCriacao = dataCriacao;
        this.bonus = bonus;

    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    protected LocalDate getDataCriacao(){
        return dataCriacao;
    }

    protected void setDataCriacao(LocalDate dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public BigDecimal getBonus(){
        return bonus;
    }

    // Metodo público int getIdade(), que calcula a idade em anos em função da data de criação e da data
    //atual.

    public int getIdade(){
        LocalDate dataAtual = LocalDate.now();
        return dataCriacao.until(dataAtual).getYears();
    }

    // Metodo público void creditarBonus(BigDecimal valor) que credita o valor ao atributo bônus.

    public void creditarBonus( BigDecimal valor){
        this.bonus = this.bonus.add(valor);
    }

    // Metodo público void debitarBonus(BigDecimal valor) que debita o valor do atributo bônus.

    public void debitarBonus(BigDecimal valor) {
        this.bonus = this.bonus.subtract(valor);
    }

}
