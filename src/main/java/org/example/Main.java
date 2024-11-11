package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicia Programa ...");
        System.out.println("Instancia classes do tipo dispositivo ...");
        Dispositivo lampada = new Lampada();
        Dispositivo ventilador = new Ventilador();

        System.out.println("Instancia Classe botao ...");
        Botao botao = new Botao(lampada);

        botao.ligar();

        botao.setDispositivo(ventilador);
        botao.ligar();

    }
}