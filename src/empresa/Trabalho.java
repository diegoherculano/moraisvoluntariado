package empresa;

import pessoa.Voluntario;

public class Trabalho {

    private Voluntario voluntario;
    private Evento evento;
    private String tipo;

    public Trabalho(Evento evento, String tipo) {
        super();
        this.evento = evento;
        this.tipo = tipo;
    }

    public Voluntario getVoluntario() {
        return voluntario;
    }

    public void setVoluntario(Voluntario voluntario) {
        this.voluntario = voluntario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
