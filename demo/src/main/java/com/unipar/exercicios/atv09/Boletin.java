package com.unipar.exercicios.atv09;

public class Boletin {

    private String noemAluno;
    private double nota1;
    private double nota2;



    public String getNoemAluno() {
        return noemAluno;
    }
    public void setNoemAluno(String noemAluno) {
        this.noemAluno = noemAluno;
    }


    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {

        if(nota1 <= 0 || nota1 > 10) {
            System.out.println("Nota inválida. A nota deve ser entre 0 e 10.");
            return;
        }else{
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {

        if(nota2 <= 0 || nota2 > 10) {
            System.out.println("Nota inválida. A nota deve ser entre 0 e 10.");
            return;
        }else{
            this.nota2 = nota2;
        }
    }   


    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void exibirSituacao() {

        double media = calcularMedia();

        if (media >= 7) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
    }


}
