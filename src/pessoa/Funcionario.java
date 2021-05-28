package pessoa;

import java.io.File;

public class Funcionario extends Pessoa {
    
    public Funcionario(String nome, String tipo, String documento) {
        super(nome, tipo, documento);
    }
    
    public void cadastrarVoluntario(Voluntario voluntario) {
        
    }
    
    public void removerVoluntario(Pessoa pessoa) {
        
    }
    
    public void aceitarDoacao(Voluntario voluntario) {
        
    }
    
    public String relatorio() {
        return null;
    }
    
    public void importar(File file) {
        
    }

    public void desativarUsuario(Voluntario voluntario) {
        voluntario.setAtivo(false);
    }

    public void ativarUsuario(Voluntario voluntario) {
        voluntario.setAtivo(true);
    }
}
