package pessoa;

import empresa.Trabalho;

public class Voluntario extends Pessoa {
    
    public Voluntario(String nome, String tipo, String documento) {
        super(nome, tipo, documento);
    }
    
    public void aceitarTrabalho(Trabalho trabalho) {
        System.out.println("pessoa.Voluntario.aceitarTrabalho()");
    }
    
}
