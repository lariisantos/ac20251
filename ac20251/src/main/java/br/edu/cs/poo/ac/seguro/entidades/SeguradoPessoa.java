package br.edu.cs.poo.ac.seguro.entidades;
import java.math.BigDecimal;
import java.time.LocalDate;

public class SeguradoPessoa extends Segurado{
    private String cpf;
    private double renda;

    public SeguradoPessoa(String nome, Endereco endereco, LocalDate dataNascimento, BigDecimal bonus, String cpf, double renda){
        super(nome, endereco, dataNascimento, bonus); // chama o construtor da superclasse
        this.cpf = cpf;
        this.renda = renda;
    }

    // Getter e setter para CPF
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter e setter para renda
    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    // Retorna a data de nascimento (data de criação)
    public LocalDate getDataNascimento() {
        return getDataCriacao();
    }

    // Altera a data de nascimento (data de criação)
    public void setDataNascimento(LocalDate dataNascimento) {
        setDataCriacao(dataNascimento);
    }
}
