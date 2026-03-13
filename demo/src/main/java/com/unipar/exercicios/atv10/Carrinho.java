package com.unipar.exercicios.atv10;

public class Carrinho {


    private int quantidadeItens;
    private double valorTotal;

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }


    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public void adicionarItem(double valor) {

        if (valor > 0) {
            quantidadeItens++;
            valorTotal += valor;
        } else {
            System.out.println("Valor do item deve ser positivo.");
        }
    }

    public void removerItem(double valor) {

        if (valor > 0 && quantidadeItens > 0) {
            quantidadeItens--;
            valorTotal -= valor;
        } else {
            System.out.println("Valor do item deve ser positivo e deve haver itens no carrinho.");
        }
    }
    
    public void aplicarDesconto(double percentual) {

        if (percentual > 0 && percentual <= 100) {
            valorTotal -= valorTotal * (percentual / 100);
        } else {
            System.out.println("Percentual de desconto deve ser entre 0 e 100.");
        }
    }
    
    public void imprimirResumo() {
        System.out.println("Quantidade de Itens: " + quantidadeItens);
        System.out.println("Valor Total: R$ " + String.format("%.2f", valorTotal));
    }
}
