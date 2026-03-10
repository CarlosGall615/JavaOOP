package com.unipar.exercicios.atv01;

public class Pessoa {

    private String nome;
    private int idade;

  
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public String toString() {

        return "\nNome: " + nome + "\nIdade: " + idade + "\n";
          
    };
        
        
        
    public Pessoa () {};



}
