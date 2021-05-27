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
	
	
	public double analisarReceitas(Doacao quantiaDoada, Evento gastoValor, double totalReceita) {
		totalReceita  = (gastoValor.getGastoValor()) - (quantiaDoada.getQuantiaDoada());
					
		return  totalReceita;
	}
	
	
	public String relatorio() {
		return null;
	}
}
