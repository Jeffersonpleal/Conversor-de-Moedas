import java.io.IOException;

public class Cambio {
    private String moeda1;
    private String moeda2;
    private double quantidade;

    public Cambio(String moeda1, String moeda2, double quantidade) {
        this.moeda1 = moeda1;
        this.moeda2 = moeda2;
        this.quantidade = quantidade;
    }

    public void imprime() throws IOException, InterruptedException {
        ConsultaMoeda consulta = new ConsultaMoeda();
        consulta.buscaMoeda(this.moeda1, this.moeda2, this.quantidade);
    }

    public String getMoeda1() {
        return moeda1;
    }

    public String getMoeda2() {
        return moeda2;
    }
}
