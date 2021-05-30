
package dados;

import empresa.Evento;
import java.util.ArrayList;
import java.util.List;

import login.Usuario;
import pessoa.Funcionario;
import pessoa.Gestor;
import pessoa.Voluntario;

public class Dados {
	public static List<Usuario> listaUsers = new ArrayList<Usuario>();
	public static List<Voluntario> listaVoluntarios = new ArrayList<Voluntario>();
	public static List<Gestor> listaGestores = new ArrayList<Gestor>();
	public static List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
        public static List<Evento> listaEventos = new ArrayList<Evento>();
	public static Usuario usuarioLogado;
}
