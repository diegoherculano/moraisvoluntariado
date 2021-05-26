package login;

import pessoa.Pessoa;

public class Usuario {

    private String user;
    private String senha;

    public Usuario(Pessoa pessoa, String user, String senha) {
        this.setUser(user);
        this.setSenha(senha);
    }

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
