package com.unipar.exercicios.atv02;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro() {}

    @Override
    public String toString() {
        return "\nMarca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano + "\n";
    }


}
