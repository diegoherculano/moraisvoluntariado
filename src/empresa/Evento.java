package empresa;

public class Evento {

    private String nome;
    private String data;
    private double gastoValor;
    private String gastoNome;

    public Evento(String nome, String data, double gastoValor, String gastoNome) {
        this.nome = nome;
        this.data = data;
        this.gastoValor = gastoValor;
        this.gastoNome = gastoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getGastoValor() {
        return gastoValor;
    }

    public void setGastoValor(double gastoValor) {
        this.gastoValor = gastoValor;
    }

    public String getGastoNome() {
        return gastoNome;
    }

    public void setGastoNome(String gastoNome) {
        this.gastoNome = gastoNome;
    }

}
