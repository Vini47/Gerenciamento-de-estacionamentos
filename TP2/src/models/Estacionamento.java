package models;

import java.time.LocalTime;

public class Estacionamento {

//    LocalTime horaAbertura = LocalTime.of();
//    LocalTime horaFechamento = LocalTime.of();
    String horaAbertura;
    String horaFechamento;
    int capacidade;


    }

    public void setHoraAbertura(String horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public String getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(String horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
