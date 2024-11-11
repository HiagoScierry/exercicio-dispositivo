package org.example;

public class Botao {

    private Dispositivo dispositivo;

    public Botao(Dispositivo dispositivo){
        setDispositivo(dispositivo);
    }

    private void atribuirDispositivo(Dispositivo dispositivo){
        if(dispositivo == null){
            throw new RuntimeException("Precisa passar uma classe do tipo Dispositivo instanciada.");
        }
    }

    public void setDispositivo(Dispositivo dispositivo) {
        atribuirDispositivo(dispositivo);

        System.out.println("Passando a classe" + dispositivo.toString() + "Para o botão");
        this.dispositivo = dispositivo;


    }

    public void ligar(){
        dispositivo.ligar();
    }
}
