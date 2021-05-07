package empresa;

import pessoa.Voluntario;

public class Trabalho {
	private Voluntario voluntario;
	private Evento evento;
	private String tipo;
	
	public Trabalho(Voluntario voluntario, Evento evento, String tipo) {
		super();
		this.voluntario = voluntario;
		this.evento = evento;
		this.tipo = tipo;
	}
	
	
}
