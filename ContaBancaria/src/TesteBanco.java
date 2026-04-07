public class TesteBanco {

    public static void main(String[] args) {


        ContaBancaria conta1 = new ContaBancaria(1, "Joao");
        ContaBancaria conta2 = new ContaBancaria(2, "Maria");

        conta1.depositar(1000);
        conta1.sacar(200);

        conta2.depositar(500);
        conta2.sacar(100);



        System.out.println("\n=== DADOS DAS CONTAS ===");
        conta1.exibirDados();
        conta2.exibirDados();





        System.out.println("Total de contas criadas: " + ContaBancaria.getTotalContas());


        ContaBancaria.setTaxaOperacao(10.0);
        System.out.println("Taxa de operacao alterada para 10.0");


        double rendimento = ContaBancaria.simularRendimento(1000, 10);
        System.out.println("Simulacao de rendimento de R$1000 a 10%: " + rendimento);


        System.out.println("\n=== TESTE DE ERRO ===");


        conta1.sacar(10000);
    }
}