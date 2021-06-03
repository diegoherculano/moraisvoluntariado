package pessoa;

import static dados.Dados.listaDoacao;
import empresa.Doacao;

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
}
