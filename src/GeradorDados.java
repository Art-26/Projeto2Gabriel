import java.util.Random;

public class GeradorDados {

    private static final Random random = new Random();

    public static int[] gerarOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) vetor[i] = i;
        return vetor;
    }

    public static int[] gerarAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) vetor[i] = random.nextInt(tamanho * 10);
        return vetor;
    }
}