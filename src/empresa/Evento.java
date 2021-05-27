package empresa;

public class Evento {
	private String nome;
	private String data;
	private double gastoValor;
	private String gastoNome;
	
	public Evento(String nome, String data, double gastoValor, String gastoNome) {
		super();
		this.nome = nome;
		this.data = data;
		this.gastoValor = gastoValor;
		this.gastoNome = gastoNome;
	}
	
	// Adicionar lista (Em andamento)
	public double adicionarGasto(String gastoNome, double gastoValor) {
		this.gastoNome = gastoNome;
		this.gastoValor += gastoValor;
		
		return this.gastoValor;
	}
	
	// Buscar na lista (Em andamento)
	public String buscar(String nome) {
		
		if (this.gastoNome.contains(nome)) {
			return this.gastoNome;
		}
		
		return null;
	}

	public double getGastoValor() {
		return gastoValor;
	}

	public void setGastoValor(double gastoValor) {
		this.gastoValor = gastoValor;
	}
	
	

}
