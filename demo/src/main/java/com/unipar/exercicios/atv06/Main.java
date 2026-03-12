package com.unipar.exercicios.atv06;

public class Main {
    public static void main(String[] args) {

    
    Pessoa pessoa1 = new Pessoa("Carlos", 29);
    System.out.println("Nome: " + pessoa1.getNome());
    System.out.println("Idade: " + pessoa1.getIdade());
    

    Pessoa pessoa2 = new Pessoa("", 131);

    System.out.println("Nome: " + pessoa2.getNome());
    System.out.println("Idade: " + pessoa2.getIdade());

    pessoa2.setIdade(150);
    
    }

}