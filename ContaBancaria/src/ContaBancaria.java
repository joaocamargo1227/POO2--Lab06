public class ContaBancaria {


    private int numeroConta;
    private String titular;
    private double saldo;


    private static int totalContas = 0;
    private static double taxaOperacao = 2.5;


    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
        totalContas++;
    }



    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado: R$" + valor);
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque invalido.");
            return;
        }

        double valorComTaxa = valor + taxaOperacao;


        System.out.println("\n[DEBUG]");
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("Valor solicitado: R$" + valor);
        System.out.println("Taxa: R$" + taxaOperacao);
        System.out.println("Total a debitar: R$" + valorComTaxa);

        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Erro: Saldo insuficiente para saque.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("\n=== DADOS DA CONTA ===");
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }



    public static int getTotalContas() {
        return totalContas;
    }

    public static void setTaxaOperacao(double novaTaxa) {
        if (novaTaxa >= 0) {
            taxaOperacao = novaTaxa;
            System.out.println("Nova taxa definida: R$" + taxaOperacao);
        } else {
            System.out.println("Taxa inválida.");
        }
    }

    public static double simularRendimento(double valor, double percentual) {
        if (valor < 0 || percentual < 0) {
            System.out.println("Valores inválidos para simulação.");
            return 0;
        }
        return valor + (valor * percentual / 100);
    }
}