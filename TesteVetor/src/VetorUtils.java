public class VetorUtils {


    private VetorUtils() {}


    public static double[] soma(double[] vetorA, double[] vetorB) {
        validarTamanho(vetorA, vetorB);

        double[] resultado = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            resultado[i] = vetorA[i] + vetorB[i];
        }

        return resultado;
    }


    public static double[] subtracao(double[] vetorA, double[] vetorB) {
        validarTamanho(vetorA, vetorB);

        double[] resultado = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            resultado[i] = vetorA[i] - vetorB[i];
        }

        return resultado;
    }


    public static double produtoEscalar(double[] vetorA, double[] vetorB) {
        validarTamanho(vetorA, vetorB);

        double resultado = 0;

        for (int i = 0; i < vetorA.length; i++) {
            resultado += vetorA[i] * vetorB[i];
        }

        return resultado;
    }


    private static void validarTamanho(double[] vetorA, double[] vetorB) {
        if (vetorA.length != vetorB.length) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo comprimento.");
        }
    }
}