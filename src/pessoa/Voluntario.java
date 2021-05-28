package pessoa;

import empresa.Trabalho;

public class Voluntario extends Pessoa {
    boolean ativo;
    
    public Voluntario(String nome, String tipo, String documento) {
        super(nome, tipo, documento);
        ativo = true;
    }
    
    public void aceitarTrabalho(Trabalho trabalho) {
        System.out.println("pessoa.Voluntario.aceitarTrabalho()");
    }

    public boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    
}
