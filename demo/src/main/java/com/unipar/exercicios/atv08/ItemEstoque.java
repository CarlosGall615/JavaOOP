package com.unipar.exercicios.atv08;

public class ItemEstoque {

    private String nome;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void entrarEstoque(int qtd){
        if(qtd <= 0){
            System.out.println("A quantidade deve ser Maior que 0.");
        }else{
            quantidade += qtd;
        }
    }

    public void sairEstoque(int qtd){

        if(qtd <= 0 ){
            System.out.println("A quantidade deve ser Maior que 0.");
        }else if(qtd > this.quantidade){
            System.out.println("A quantidade deve ser Menor que " + this.quantidade);
        }else{
            quantidade -= qtd;
        }

    }

}
