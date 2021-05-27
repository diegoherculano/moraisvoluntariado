package empresa;

import pessoa.Voluntario;

public class Doacao {
	private Voluntario voluntario;
	private double quantiaDoada;
	private String formaEntrega;
	
	public Doacao(Voluntario voluntario, double quantiaDoada, String formaEntrega) {
		this.voluntario = voluntario;
		this.quantiaDoada = quantiaDoada;
		this.formaEntrega = formaEntrega;
	}

	public double getQuantiaDoada() {
		return quantiaDoada;
	}

	public void setQuantiaDoada(double quantia) {
		this.quantiaDoada = quantia;
	}
		

}
