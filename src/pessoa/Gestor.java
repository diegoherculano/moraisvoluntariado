package pessoa;
import empresa.Evento;
import empresa.Doacao;

public class Gestor extends Pessoa {

	public Gestor(String nome, String tipo, String documento) {
		super(nome, tipo, documento);
	}
	
	public void cadastrarFuncionario(Funcionario funcionario) {
		
	}
	
	public String analisarGastos() {
		return null;
	}
	
	
	public double analisarReceitas(Doacao quantiaDoada, Evento gastoValor, double totalReceita) {
		totalReceita  = (gastoValor.getGastoValor()) - (quantiaDoada.getQuantiaDoada());
					
		return  totalReceita;
	}
	
	
	public String relatorio() {
		return null;
	}
}
