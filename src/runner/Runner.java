package runner;

import empresa.Evento;
import empresa.Trabalho;
import login.Usuario;
import pessoa.Pessoa;
import pessoa.Voluntario;
import java.util.List;

public class Runner {

	public static void adicionarUsuario() {
		Pessoa marcos = new Voluntario("Marcos", "PF", "131212");
		Usuario mrc = new Usuario(marcos, "mrc", "123");
		dados.Dados.listaUsers.add(mrc);
	}
}
