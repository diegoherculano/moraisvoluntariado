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

    public static void adicionarEventosETrabalhos() {
        Evento evento1 = new Evento("Jantar Beneficente", "12/01/2022", 90000, "Arranjos, Bolo");
        Evento evento2 = new Evento("Futebol beneficente", "23/04/2021", 90000, "Estrutura, aluguel");
        Evento evento3 = new Evento("Volei beneficente", "17/06/2024", 90000, "Esrutura, aluguel");
        Evento evento4 = new Evento("Caminhada beneficente", "01/04/2022", 90000, "Estrutura, aluguel");
        listaEventos.add(evento1);
        listaEventos.add(evento2);
        listaEventos.add(evento3);
        listaEventos.add(evento4);
        Trabalho trabalho1 = new Trabalho(evento1, "Entregador");
        Trabalho trabalho2 = new Trabalho(evento2, "Arbitro");
        Trabalho trabalho3 = new Trabalho(evento3, "Gandula");
        Trabalho trabalho4 = new Trabalho(evento4, "Faxineiro");
        listaTrabalhos.add(trabalho1);
        listaTrabalhos.add(trabalho2);
        listaTrabalhos.add(trabalho3);
        listaTrabalhos.add(trabalho4);
    }

}
