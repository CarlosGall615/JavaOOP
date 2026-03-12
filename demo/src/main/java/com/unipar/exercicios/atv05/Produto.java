package com.unipar.exercicios.atv05;

public class Produto {

    private String nome;
    private double preco;

    public Produto (){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
            this.preco = preco;
    }

    @Override
    public String toString() {
        if(this.preco < 0 || this.nome == null || this.nome.isEmpty()){
            return "O nome não pode ficar Vazio.\nPreço inválido.";
        }
        return "Nome: " + nome + "\nValor(R$): " + preco + "\n";
    }

    

}
