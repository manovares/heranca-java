package Exercicio1;

public class Aviao extends Veiculo {

    private int numerodeMotores;

    public Aviao(String marca, String modelo, int anoFabricacao, int VelocidadeMaxima, int numerodeMotores) {
        super(marca, modelo, anoFabricacao, VelocidadeMaxima);
        this.numerodeMotores = numerodeMotores;
    }

    public int getNumerodeMotores() {
        return numerodeMotores;
    }

    public void setNumerodeMotores(int numerodeMotores) {
        this.numerodeMotores = numerodeMotores;
    }

    public void decolar(){
        System.out.println(">>> O avião esta decolando......");
    }

    //Exemplo de reescrita (override) de um metodo da superclasse - POLIMORDISMO
    @Override
    public void acelerar(){
        System.out.println(">>> O avião esta acelerando....");
    }
}
