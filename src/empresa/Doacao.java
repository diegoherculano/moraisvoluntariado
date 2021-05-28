package empresa;

import pessoa.Voluntario;

public class Doacao {
	private Voluntario voluntario;
	private double quantiaDoada;
	private String formaEntrega;
	private boolean repeteMes;

	public Doacao(Voluntario voluntario, double quantiaDoada, String formaEntrega, boolean repeteMes) {
		this.voluntario = voluntario;
		this.quantiaDoada = quantiaDoada;
		this.formaEntrega = formaEntrega;
		this.repeteMes = repeteMes;
	}

	public Voluntario getVoluntario() {
		return voluntario;
	}

	public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
	}

	public double getQuantiaDoada() {
		return quantiaDoada;
	}

	public void setQuantiaDoada(double quantiaDoada) {
		this.quantiaDoada = quantiaDoada;
	}

	public String getFormaEntrega() {
		return formaEntrega;
	}

	public void setFormaEntrega(String formaEntrega) {
		this.formaEntrega = formaEntrega;
	}

	public boolean isRepeteMes() {
		return repeteMes;
	}

	public void setRepeteMes(boolean repeteMes) {
		this.repeteMes = repeteMes;
	}

}
