package pessoa;

import empresa.Evento;
import empresa.Doacao;

public class Gestor extends Pessoa {

	public Gestor(String nome, String tipo, String documento) {
		super(nome, tipo, documento);
	}

	public void cadastrarFuncionario(Funcionario funcionario) {

	}

	public double analisarGastos(Evento gastoValor) {
		double gastos = (gastoValor.getGastoValor());

		return gastos;
	}

	public double analisarReceitas(Doacao doacao, Evento evento) {
		double totalReceita = evento.getGastoValor() - doacao.getQuantiaDoada();
		return totalReceita;
	}

	public String relatorio() {
		return null;
	}

}
