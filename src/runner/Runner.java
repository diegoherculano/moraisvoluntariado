package runner;

import empresa.Evento;
import empresa.Trabalho;
import login.Usuario;
import pessoa.Gestor;
import pessoa.Pessoa;
import pessoa.Voluntario;
import java.util.List;
import static dados.Dados.*;
import pessoa.Funcionario;

public class Runner {

    public static void adicionarVoluntario() {
        Voluntario marcos = new Voluntario("Marcos", "PF", "131212");
        Usuario mrc = new Usuario(marcos, "marcos", "123");
        listaUsers.add(mrc);
        listaVoluntarios.add(marcos);
    }

    public static void adicionarGestor() {
        Gestor paulo = new Gestor("Paulo", "PF", "456456");
        Usuario pl = new Usuario(paulo, "paulo", "123");
        listaGestores.add(paulo);
        listaUsers.add(pl);
    }

    public static void adicionarFuncionario() {
        Funcionario lucas = new Funcionario("Lucas", "PF", "1313212");
        Usuario luc = new Usuario(lucas, "lucas", "123");
        listaFuncionarios.add(lucas);
        listaUsers.add(luc);
    }

}
