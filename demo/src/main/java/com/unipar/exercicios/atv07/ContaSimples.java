package com.unipar.exercicios.atv07;

public class ContaSimples {

    private String titular;
    private double saldo = 0.0;

    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    

    public void depositar(double valor){

        

        if(valor > 0){
            System.out.println("Depósito de " + valor + " efetuado com sucesso");
            saldo += valor;
        }else{
            System.out.println("Valor de Depósito Inválido");
        }
    }
    
}
