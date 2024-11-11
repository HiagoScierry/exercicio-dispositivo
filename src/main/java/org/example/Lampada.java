package org.example;

public class Lampada implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("Lampada ligada");
    }
}
