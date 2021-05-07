package empresa;

import pessoa.Voluntario;

public class Doacao {
	private Voluntario voluntario;
	private String objeto;
	private String formaEntrega;
	
	public Doacao(Voluntario voluntario, String objeto, String formaEntrega) {
		this.voluntario = voluntario;
		this.objeto = objeto;
		this.formaEntrega = formaEntrega;
	}
		
}
