package com.unipar.exercicios.atv05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto();
        produto1.setNome("Produto 1");
        produto1.setPreco(4.00);
        listaDeProdutos.add(produto1);

        Produto produto2 = new Produto();
        produto2.setNome("");
        produto2.setPreco(-50.00);
        listaDeProdutos.add(produto2);

        System.out.println("---- # Lista de Produtos --- \n");

        for (int i = 0; i < listaDeProdutos.size(); i++){
            System.out.println(listaDeProdutos.get(i).toString());
            
            }
        
    }

}