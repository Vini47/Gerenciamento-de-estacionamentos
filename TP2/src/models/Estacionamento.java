package models;

public class Estacionamento {

    private String nomeEmpresa;
    private String nomeEstacionamento;
    private int capacidade;
    private String horaAbertura;
    private String horaFechamento;
    private double porcentagemLucro;


    @Override
    public String toString() {
        return "Estacionamento{" +
                "nomeEmpresa='" + nomeEmpresa + '\'' +
                ", nomeEstacionamento='" + nomeEstacionamento + '\'' +
                ", capacidade=" + capacidade +
                ", horaAbertura='" + horaAbertura + '\'' +
                ", horaFechamento='" + horaFechamento + '\'' +
                ", porcentagemLucro=" + porcentagemLucro +
                '}';
    }

    public Estacionamento(String nomeEmpresa, String nomeEstacionamento, int capacidade, String horaAbertura, String horaFechamento, double porcentagemLucro) {
        this.nomeEmpresa = nomeEmpresa;
        this.nomeEstacionamento = nomeEstacionamento;
        this.capacidade = capacidade;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.porcentagemLucro = porcentagemLucro;
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
}



