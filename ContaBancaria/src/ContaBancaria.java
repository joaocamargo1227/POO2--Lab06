public class ContaBancaria {


    private int numeroConta;
    private String nomeTitular;
    private double saldo;


    private static int totalContas = 0;
    private static double taxaOperacao = 2.0; // taxa padrão de 2%


    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        totalContas++;
    }



    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado na conta %d.%n", valor, numeroConta);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }
        double taxa = valor * (taxaOperacao / 100.0);
        double totalDebito = valor + taxa;

        if (totalDebito > saldo) {
            System.out.printf("Saldo insuficiente na conta %d. "
                            + "Saldo atual: R$ %.2f | Valor necessário (com taxa): R$ %.2f%n",
                    numeroConta, saldo, totalDebito);
            return;
        }
        saldo -= totalDebito;
        System.out.printf("Saque de R$ %.2f realizado na conta %d "
                        + "(taxa: R$ %.2f). Novo saldo: R$ %.2f%n",
                valor, numeroConta, taxa, saldo);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("─────────────────────────────────");
        System.out.println("Conta   : " + numeroConta);
        System.out.println("Titular : " + nomeTitular);
        System.out.printf("Saldo   : R$ %.2f%n", saldo);
        System.out.println("─────────────────────────────────");
    }



    public static int getTotalContas() {
        return totalContas;
    }

    public static void setTaxaOperacao(double novaTaxa) {
        if (novaTaxa < 0) {
            System.out.println("Taxa inválida. Deve ser >= 0.");
            return;
        }
        taxaOperacao = novaTaxa;
        System.out.printf("Taxa de operação atualizada para %.2f%%%n", taxaOperacao);
    }

    public static double simularRendimento(double valor, double taxaPercentual) {
        double rendimento = valor * (taxaPercentual / 100.0);
        double resultado = valor + rendimento;
        System.out.printf("Simulação: R$ %.2f com %.2f%% de rendimento = R$ %.2f%n",
                valor, taxaPercentual, resultado);
        return resultado;
    }
}
