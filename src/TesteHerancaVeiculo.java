public class TesteHerancaVeiculo{
    public static void main(String[] args) {
        System.out.println("--- Teste do Carro ----");
        Carro meuCarro = new Carro("fiat", "147", 2025, 100, 2);
        meuCarro.acelerar();
        meuCarro.LigarLimpadorParabrisa();
        meuCarro.parar();
        System.out.println("Marca do carro: " + meuCarro.getMarca());
        System.out.println("Numero de portas: " + meuCarro.getNumeroPortas());

        System.out.println("---- Teste Avião -------");
        Aviao meuAviao = new Aviao("Boing", "177", 2005, 300, 3);

        meuAviao.acelerar();
        meuAviao.decolar();
        meuAviao.parar();
            
    }
}
