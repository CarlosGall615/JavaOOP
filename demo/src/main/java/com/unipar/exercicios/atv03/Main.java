package com.unipar.exercicios.atv03;

public class Main {
    public static void main(String[] args) {

        Lampada lampada1 = new Lampada("Philips", "60W", true);
        Lampada lampada2 = new Lampada("Osram", "40W", false);

        System.out.println("\nLâmpada 1\n" + lampada1.getMarca() + ", " + lampada1.getPotencia() + ", Ligada: " + lampada1.isLigada());
        lampada1.estadoLampada("estado\n");

        System.out.println("\nLâmpada 2\n" + lampada2.getMarca() + ", " + lampada2.getPotencia() + ", Ligada: " + lampada2.isLigada());
        lampada2.estadoLampada("estado\n");  
    }

        


    
}