package models;

import java.util.ArrayList;

public class Evento {
    private String nomeEvento;
    private int valorEvento;
    private ArrayList<Acesso> acessos = new ArrayList<Acesso>();

    public Evento(String nomeEvento, int valorEvento) {
        this.nomeEvento = nomeEvento;
        this.valorEvento = valorEvento;
    }

    public Evento(String nomeEvento, int valorEvento, ArrayList<Acesso> acessos) {
        this.nomeEvento = nomeEvento;
        this.valorEvento = valorEvento;
        this.acessos = acessos;
    }

    public ArrayList<Acesso> getAcessos() {
        return acessos;
    }

    public void setAcessos(ArrayList<Acesso> acessos) {
        this.acessos = acessos;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public int getValorEvento() {
        return valorEvento;
    }

    public void setValorEvento(int valorEvento) {
        this.valorEvento = valorEvento;
    }
}
