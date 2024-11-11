package org.example;

public class Main {
    public static void main(String[] args) {
        Dispositivo lampada = new Lampada();
        Dispositivo ventilador = new Ventilador();

        Botao botao = new Botao(lampada);

        botao.ligar();

        botao.setDispositivo(ventilador);
        botao.ligar();

    }
}