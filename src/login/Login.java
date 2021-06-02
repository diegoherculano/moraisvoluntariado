package login;

import static dados.Dados.listaUsers;
import static dados.Dados.usuarioLogado;
import static runner.Runner.*;
public class Login {
    public static boolean naoRepetir = false;
    
    public static String logar(String usuario, String senha) {
        if (!naoRepetir) {
            // Adiciona valores para teste
            adicionarGestor();
            adicionarVoluntario();
            adicionarFuncionario();
            adicionarEventosETrabalhos();
            naoRepetir = true;
        }
        
        // Aqui comeca o metodo logar
        for (int i = 0; i < listaUsers.size(); i++) {
            Usuario userName = listaUsers.get(i);
            if (userName.getUser().equals(usuario)) {
                if (userName.getSenha().equals(senha)) {
                    usuarioLogado = userName;
                    return userName.getTipo();
                }
            }
        }

        return "";
    }
}
