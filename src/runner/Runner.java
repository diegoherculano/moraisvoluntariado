package runner;

import empresa.Evento;
import empresa.Trabalho;
import login.Usuario;
import pessoa.Gestor;
import pessoa.Pessoa;
import pessoa.Voluntario;
import java.util.List;
import static dados.Dados.*;

public class Runner {

	public static void adicionarVoluntario() {
		Voluntario marcos = new Voluntario("Marcos", "PF", "131212");
		Usuario mrc = new Usuario(marcos, "mrc", "123");
		listaUsers.add(mrc);
		listaVoluntarios.add(marcos);
	}

	public static void adicionarGestor() {
		Gestor paulo = new Gestor("Paulo", "PF", "456456");
		Usuario pl = new Usuario(paulo, "paulo", "123");
		listaGestores.add(paulo);
		listaUsers.add(pl);
	}
	
	
}
