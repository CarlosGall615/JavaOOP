package com.unipar.exercicios.atv06;

public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(this.nome == null || this.nome.isEmpty()){
            return;
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (this.idade <= 0 || this.idade > 120){
            return;
        }

        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }
    
    
}
