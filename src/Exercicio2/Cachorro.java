package Exercicio2;

public class Cachorro extends Animal {
    private String raca;


    public Cachorro(String nome, String cor, int patas, String raca) {
        super(nome, cor, patas);
        this.raca = raca;
    }

    public void exibirDados(){
        System.out.println("Dados do Cachorro");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Patas: " + this.patas);
        System.out.println("Raça: " + this.raca);

    }
}
