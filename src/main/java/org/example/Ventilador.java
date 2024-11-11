package org.example;

public class Ventilador implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("Ventilador ligado");
    }
}
