package com.unipar.exercicios.atv04;

public class Main {
    public static void main(String[] args) {

         
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.setNome("João");
        aluno1.setMatricula(12345); 

        aluno2.setNome("Maria");    
        aluno2.setMatricula(67890);

        aluno3.setNome("Pedro");
        aluno3.setMatricula(54321);

        System.out.println("Aluno 1\n" + aluno1.getNome() + " / Matrícula: " + aluno1.getMatricula() + "\n");
        System.out.println("Aluno 2\n" + aluno2.getNome() + " / Matrícula: " + aluno2.getMatricula() + "\n");
        System.out.println("Aluno 3\n" + aluno3.getNome() + " / Matrícula: " + aluno3.getMatricula() + "\n");


    }

        


    
}