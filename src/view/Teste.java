package view;

import java.util.List;

import login.Usuario;
import pessoa.Funcionario;
import pessoa.Gestor;
import pessoa.Pessoa;
import pessoa.Voluntario;

import static dados.Dados.*;

import static dados.Dados.*;
import static runner.Runner.*;

public class Teste {
	public static void main(String[] args) {
		adicionarVoluntario();
		adicionarGestor();
		String user = "paulo";
		String senha = "123";
		String msg = "-";

		for (int i = 0; i < listaUsers.size(); i++) {
			Usuario userName = listaUsers.get(i);
			if (userName.getUser().equals(user)) {
				if (userName.getSenha().equals(senha)) {
					System.out.println(userName.getTipo());
					switch (userName.getTipo()) {
					case "Gestor":
						telaGestor(userName.getGestor());
						break;
					case "Voluntario":
						telaVoluntario(userName.getVoluntario());
						break;
					case "Funcionario":
						telaFuncionario(userName.getFuncionario());
						break;
					default:
						break;
					}
				}
			}
		}

	}

	public static void telaGestor(Gestor gestor) {
		System.out.println(gestor.getNome());
	}

	public static void telaVoluntario(Voluntario voluntario) {
		System.out.println(voluntario.getNome());
	}
	
	public static void telaFuncionario(Funcionario funcionario) {
		System.out.println(funcionario.getNome());
	}
}
