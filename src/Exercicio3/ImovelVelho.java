package Exercicio3;

public class ImovelVelho extends Imovel {
    private float  desconto;

    public ImovelVelho(String endereco, float preco, float desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public float calcularPreco() {
        preco = preco - desconto;
        return preco;
    }
}
