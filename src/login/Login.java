package login;

import static dados.Dados.listaUsers;
import static runner.Runner.*;
public class Login {

    public static String logar(String usuario, String senha) {
        // Adiciona valores para teste
        adicionarGestor();
        adicionarVoluntario();
        
        // Aqui comeca o metodo logar
        for (int i = 0; i < listaUsers.size(); i++) {
            Usuario userName = listaUsers.get(i);
            if (userName.getUser().equals(usuario)) {
                if (userName.getSenha().equals(senha)) {
                    return userName.getTipo();
                }
            }
        }

        return "";
    }
}
