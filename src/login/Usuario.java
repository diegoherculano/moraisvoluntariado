package login;

import pessoa.Funcionario;
import pessoa.Gestor;
import pessoa.Pessoa;
import pessoa.Voluntario;

public class Usuario {

    private String user;
    private String senha;
    private String tipo;
    private Gestor gestor;
    private Voluntario voluntario;
    private Funcionario funcionario;
    
    public Usuario(Gestor pessoa, String user, String senha) {
        this.setUser(user);
        this.setSenha(senha);
        this.setGestor(pessoa);
        this.setTipo("Gestor");
    }
    
    public Usuario(Voluntario pessoa, String user, String senha) {
        this.setUser(user);
        this.setSenha(senha);
        this.setVoluntario(pessoa);
        this.setTipo("Voluntario");
    }
    
    public Usuario(Funcionario pessoa, String user, String senha) {
        this.setUser(user);
        this.setSenha(senha);
        this.setFuncionario(pessoa);
        this.setTipo("Funcionario");
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public Voluntario getVoluntario() {
		return voluntario;
	}

	public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
