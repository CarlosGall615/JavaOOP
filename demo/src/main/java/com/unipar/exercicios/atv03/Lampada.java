package com.unipar.exercicios.atv03;

public class Lampada {
    private String marca;
    private String potencia;
    private boolean ligada;

    public Lampada(String marca, String potencia, boolean ligada) {
        this.marca = marca;
        this.potencia = potencia;
        this.ligada = ligada;
    }

    public Lampada () {}

    public String getMarca() {
        return marca;
    }

    public String getPotencia() {
        return potencia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligarLampada() {
        this.ligada = true;
    }

    public void desligarLampada() {
        this.ligada = false;
    }

    public void estadoLampada(String estado) {
        if (this.ligada) {
            System.out.println("Lampada está ligada.");
        }else { 
            System.out.println("Lampada está desligada.");
        }
    }
}
