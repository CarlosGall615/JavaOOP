package com.unipar.exercicios.atv08;

public class Main {
    public static void main(String[] args) {

    
        ItemEstoque item1 = new ItemEstoque();

        System.out.println("Quantidade Inicial: " + item1.getQuantidade() + "\n");

        item1.entrarEstoque(10);
        System.out.println("Quantidade Atual: " + item1.getQuantidade() + "\n");
        
        item1.sairEstoque(5);
        System.out.println("Quantidade Atual: " + item1.getQuantidade() + "\n");

        item1.entrarEstoque(0);
        item1.sairEstoque(0);
        item1.sairEstoque(10);
        System.out.println("Quantidade Atual: " + item1.getQuantidade() + "\n");

    
    }

}