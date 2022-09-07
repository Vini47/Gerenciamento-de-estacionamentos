package models;

import java.util.ArrayList;

public class Estacionamento {

    private String nomeEmpresa;
    private String nomeEstacionamento;
    private int capacidade;
    private String horaAbertura;
    private String horaFechamento;
    private double porcentagemLucro;
    private double valorFracao;
    private double valorDescontoHora;
    private double valorMensalista;
    private double valorDiariaDiurna;
    private double valorDiariaNoturna;
    private ArrayList<Acesso> acessos = new ArrayList<Acesso>();

//    @Override
//    public String toString() {
//
//        return "Estacionamento{" +
//                "nomeEmpresa='" + nomeEmpresa + '\'' +
//                ", nomeEstacionamento='" + nomeEstacionamento + '\'' +
//                ", capacidade=" + capacidade +
//                ", horaAbertura='" + horaAbertura + '\'' +
//                ", horaFechamento='" + horaFechamento + '\'' +
//                ", porcentagemLucro=" + porcentagemLucro +
//                ", valorFracao=" + valorFracao +
//                ", valorDescontoHora=" + valorDescontoHora +
//                ", valorMensalista=" + valorMensalista +
//                ", valorDiariaDiurna=" + valorDiariaDiurna +
//                ", valorDiariaNoturna=" + valorDiariaNoturna +
//                '}';
//
//    }


    @Override
    public String toString() {
        return "Estacionamento{" +
                "nomeEmpresa='" + nomeEmpresa + '\'' +
                ", nomeEstacionamento='" + nomeEstacionamento + '\'' +
                ", capacidade=" + capacidade +
                ", horaAbertura='" + horaAbertura + '\'' +
                ", horaFechamento='" + horaFechamento + '\'' +
                ", porcentagemLucro=" + porcentagemLucro +
                ", valorFracao=" + valorFracao +
                ", valorDescontoHora=" + valorDescontoHora +
                ", valorMensalista=" + valorMensalista +
                ", valorDiariaDiurna=" + valorDiariaDiurna +
                ", valorDiariaNoturna=" + valorDiariaNoturna +
                ", acessos=" + acessos +
                '}';
    }

    public Estacionamento(String nomeEmpresa, String nomeEstacionamento, int capacidade, String horaAbertura, String horaFechamento, double porcentagemLucro, double valorFracao, double valorDescontoHora, double valorMensalista, double valorDiariaDiurna, double valorDiariaNoturna) {
        this.nomeEmpresa = nomeEmpresa;
        this.nomeEstacionamento = nomeEstacionamento;
        this.capacidade = capacidade;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.porcentagemLucro = porcentagemLucro;
        this.valorFracao = valorFracao;
        this.valorDescontoHora = valorDescontoHora;
        this.valorMensalista = valorMensalista;
        this.valorDiariaDiurna = valorDiariaDiurna;
        this.valorDiariaNoturna = valorDiariaNoturna;
    }

    public ArrayList<Acesso> getAcessos() {
        return acessos;
    }

    public void setAcessos(ArrayList<Acesso> acessos) {
        this.acessos = acessos;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEstacionamento() {
        return nomeEstacionamento;
    }

    public void setNomeEstacionamento(String nomeEstacionamento) {
        this.nomeEstacionamento = nomeEstacionamento;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getHoraAbertura() {
        return horaAbertura;
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

    public double getPorcentagemLucro() {
        return porcentagemLucro;
    }

    public void setPorcentagemLucro(double porcentagemLucro) {
        this.porcentagemLucro = porcentagemLucro;
    }

    public double getValorFracao() {
        return valorFracao;
    }

    public void setValorFracao(double valorFracao) {
        this.valorFracao = valorFracao;
    }

    public double getValorDescontoHora() {
        return valorDescontoHora;
    }

    public void setValorDescontoHora(double valorDescontoHora) {
        this.valorDescontoHora = valorDescontoHora;
    }

    public double getValorMensalista() {
        return valorMensalista;
    }

    public void setValorMensalista(double valorMensalista) {
        this.valorMensalista = valorMensalista;
    }

    public double getValorDiariaDiurna() {
        return valorDiariaDiurna;
    }

    public void setValorDiariaDiurna(double valorDiariaDiurna) {
        this.valorDiariaDiurna = valorDiariaDiurna;
    }

    public double getValorDiariaNoturna() {
        return valorDiariaNoturna;
    }

    public void setValorDiariaNoturna(double valorDiariaNoturna) {
        this.valorDiariaNoturna = valorDiariaNoturna;
    }
}



