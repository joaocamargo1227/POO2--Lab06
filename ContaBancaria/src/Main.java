public class Main {

    public static void main(String[] args) {

        System.out.println("═══════════════════════════════════════");
        System.out.println("    SISTEMA BANCÁRIO — TESTE GERAL     ");
        System.out.println("═══════════════════════════════════════\n");


        ContaBancaria conta1 = new ContaBancaria(1001, "Ana Souza");
        ContaBancaria conta2 = new ContaBancaria(1002, "Bruno Lima");

        System.out.println("Total de contas criadas: " + ContaBancaria.getTotalContas());
        System.out.println();


        System.out.println("--- Depósitos ---");
        conta1.depositar(1000.00);
        conta2.depositar(500.00);
        System.out.println();


        System.out.println("--- Saques (taxa atual: 2%) ---");
        conta1.sacar(200.00);   // OK
        conta2.sacar(600.00);   // Deve falhar — saldo insuficiente
        System.out.println();


        System.out.println("--- Dados das contas ---");
        conta1.exibirDados();
        conta2.exibirDados();
        System.out.println();


        System.out.println("--- Métodos estáticos ---");


        System.out.println("Total de contas: " + ContaBancaria.getTotalContas());


        ContaBancaria.setTaxaOperacao(3.5);


        System.out.println("\n--- Novo saque com taxa de 3.5% ---");
        conta1.sacar(100.00);


        System.out.println("\n--- Simulação de rendimento ---");
        ContaBancaria.simularRendimento(1000.00, 8.5);
        ContaBancaria.simularRendimento(conta2.consultarSaldo(), 5.0);


        System.out.println("\n--- Estado final das contas ---");
        conta1.exibirDados();
        conta2.exibirDados();
    }
}
