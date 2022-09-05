package models;

import java.util.Date;

public class Estacionamento {

    private int capacidade;
    private Date horaAbertura;
    private Date horaFechamento;
    private Acesso acesso;
    
	public Estacionamento(int capacidade, Date horaAbertura, Date horaFechamento, Acesso acesso) {
		this.capacidade = capacidade;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.acesso = acesso;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Date getHoraAbertura() {
		return horaAbertura;
	}

	public void setHoraAbertura(Date horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public Date getHoraFechamento() {
		return horaFechamento;
	}

	public void setHoraFechamento(Date horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}
}
