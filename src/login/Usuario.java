package login;

import pessoa.Pessoa;

public class Usuario extends Pessoa {
	private String user;
	private String senha;
    private String tipo;
    
	public Usuario(String nome, String tipo, String documento, String user, String senha, String tipo2) {
		super(nome, tipo, documento);
		this.user = user;
		this.senha = senha;
		this.tipo = tipo2;
	} 
 
}
