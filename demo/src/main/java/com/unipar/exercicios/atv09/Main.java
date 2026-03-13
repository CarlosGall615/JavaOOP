package com.unipar.exercicios.atv09;

public class Main {
    public static void main(String[] args) {

    
        Boletin aluno1 = new Boletin();

        aluno1.setNoemAluno("João");
        aluno1.setNota1(8.5);
        aluno1.setNota2(7.0);

        System.out.println("Nome do aluno: " + aluno1.getNoemAluno());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Média: " + aluno1.calcularMedia());
        aluno1.exibirSituacao();

        Boletin aluno2 = new Boletin();

        aluno2.setNoemAluno("Maria");
        aluno2.setNota1(-5.0);
        aluno2.setNota2(6.0);

        System.out.println("Nome do aluno: " + aluno2.getNoemAluno());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Média: " + aluno2.calcularMedia());
        aluno2.exibirSituacao();

    }

}