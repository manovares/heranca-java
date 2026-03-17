package Exercicio3;

public class ImovelNovo extends Imovel {
    private float adicional;

    public ImovelNovo(String endereco, float preco, float adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }

    public float calcularPreco() {
        preco = preco + adicional;
        return preco;
    }
}
