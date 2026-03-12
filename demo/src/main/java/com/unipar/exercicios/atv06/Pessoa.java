package com.unipar.exercicios.atv06;

public class Pessoa {

    private String nome;
    private int idade;

     public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if(nome == null || nome.isEmpty()){
            System.out.println("Nome é Obrigatório.");
        }else{
            this.nome = nome;
        }
        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        if (idade < 0 || idade > 120){
            System.out.println("Idade inválida. Deve estar entre 0 e 120.");
        }else{
            this.idade = idade;
        }
    }  

}
