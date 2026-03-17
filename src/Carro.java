//Subclasse: Carro (herda de Vei´culo)
public class Carro extends Veiculo {
    private int numeroPortas;
    public Carro(String marca, String modelo, int anoFabricacao, int velocidadeMaxima, int numeroPortas) {
        super(marca, modelo, anoFabricacao, velocidadeMaxima);
        this.numeroPortas = numeroPortas;
    }

    //metódo específico
    public void LigarLimpadorParabrisa() {
        System.out.println(">>>Ligando parabrisa...");
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
