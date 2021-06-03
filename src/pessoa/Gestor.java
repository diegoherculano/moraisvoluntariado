package pessoa;

import static dados.Dados.*;
import empresa.Doacao;
import empresa.Evento;

public class Gestor extends Pessoa {

    public Gestor(String nome, String tipo, String documento) {
        super(nome, tipo, documento);
    }
    
    public double totalDoacao() {
        double total = 0;
        for (Doacao doacao : listaDoacao) {
            total += doacao.getQuantiaDoada();
        }
        
        return total;
    }
    
    public double totalGastos() {
        double total = 0;
        for (Evento evento : listaEventos) {
            total += evento.getGastoValor();
        }
        
        return total;
    }
}
