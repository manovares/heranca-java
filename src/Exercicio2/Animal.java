package Exercicio2;

public class Animal {
    protected String nome;
    protected String cor;
    protected int patas;

    public Animal(String nome, String cor, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.patas = patas;
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Patas: " + this.patas);
    }
}
