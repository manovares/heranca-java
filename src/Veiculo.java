//Super Classe - Classe Base
public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidadeMaxima;

    public Veiculo(String marca, String modelo, int anoFabricacao, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeMaxima = velocidadeMaxima;
        System.out.println(">>>> Um novo veículo da " + marca + " foi cadastrado");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //Método comuns (herdados)
    public void acelerar() {
        System.out.println(">>> Veículo acelerando...");
    }

    public void parar() {
        System.out.println(">>>Veículo parando...");
    }
}
