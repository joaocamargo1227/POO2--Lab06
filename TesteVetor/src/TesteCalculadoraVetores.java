import java.util.Arrays;

public class TesteCalculadoraVetores {

    public static void main(String[] args) {

        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};

        System.out.println("Vetor 1: " + Arrays.toString(v1));
        System.out.println("Vetor 2: " + Arrays.toString(v2));


        double[] soma = VetorUtils.soma(v1, v2);
        System.out.println("\nSoma: " + Arrays.toString(soma));


        double[] sub = VetorUtils.subtracao(v1, v2);
        System.out.println("Subtracao: " + Arrays.toString(sub));


        double produto = VetorUtils.produtoEscalar(v1, v2);
        System.out.println("Produto Escalar: " + produto);


        double[] v3 = {1.0, 2.0};

        System.out.println("\nTestando excecao com vetores de tamanhos diferentes...");

        try {
            VetorUtils.soma(v1, v3);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao tentar somar vetores: " + e.getMessage());
        }
    }
}