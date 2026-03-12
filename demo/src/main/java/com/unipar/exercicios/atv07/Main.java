package com.unipar.exercicios.atv07;

public class Main {
    public static void main(String[] args) {

    ContaSimples conta1 = new ContaSimples();
    
    System.out.println("Saldo Inicial: " + conta1.getSaldo() + "\n");
    
    conta1.depositar(10.40);
    conta1.depositar(-20.0);
    conta1.depositar(65.84);
    conta1.depositar(-0.0);
    conta1.depositar(-44.0);
    
    System.out.println("Saldo Final: " + conta1.getSaldo());
    
    
    }

}