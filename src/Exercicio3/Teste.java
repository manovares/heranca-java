package Exercicio3;

public class Teste {
    public static void main(String[] args) {
        Imovel Ii = new Imovel("Rua Silva, 123",300000f);
        ImovelNovo i1 = new ImovelNovo("Rua Joaquim, 999",250000f,20000f);
        ImovelVelho I2 = new ImovelVelho("Av Brasil, 777", 500000, 350000);

        System.out.println(Ii.getEndereco());
        System.out.println("Preço: " + Ii.getPreco());
        System.out.println("\n");

        System.out.println(i1.getEndereco());
        System.out.println("Preço: " + Ii.getPreco());
        System.out.println("Preço Atualizado: " +  i1.calcularPreco());
        System.out.println("\n");

        System.out.println(I2.getEndereco());
        System.out.println("Preço: " + I2.getPreco());
        System.out.println("Preço atualizado: " +  I2.calcularPreco());



    }
}
