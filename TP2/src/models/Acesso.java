package models;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Acesso {
    private String placa;
    private boolean mensalista;
    private LocalDateTime diaHoraEntrada;
    private LocalDateTime diaHoraSaida;

    public Acesso(String placa) {
    }

    //construtor para acesso de Evento
    public Acesso(String placa, boolean mensalista) {
        this.placa = placa;
        this.mensalista = mensalista;
    }

    public Acesso(String placa, boolean mensalista, LocalDateTime diaHoraEntrada, LocalDateTime diaHoraSaida) {
        this.placa = placa;
        this.mensalista = mensalista;
        this.diaHoraEntrada = diaHoraEntrada;
        this.diaHoraSaida = diaHoraSaida;
    }

    @Override
    public String toString() {
        return "Acesso{" +
                "placa='" + placa + '\'' +
                ", mensalista=" + mensalista +
                ", diaHoraEntrada=" + diaHoraEntrada +
                ", diaHoraSaida=" + diaHoraSaida +
                '}';
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isMensalista() {
        return mensalista;
    }

    public void setMensalista(boolean mensalista) {
        this.mensalista = mensalista;
    }

    public LocalDateTime getDiaHoraEntrada() {
        return diaHoraEntrada;
    }

    public void setDiaHoraEntrada(LocalDateTime diaHoraEntrada) {
        this.diaHoraEntrada = diaHoraEntrada;
    }

    public LocalDateTime getDiaHoraSaida() {
        return diaHoraSaida;
    }

    public void setDiaHoraSaida(LocalDateTime diaHoraSaida) {
        this.diaHoraSaida = diaHoraSaida;
    }
}
