import java.util.Scanner;
// 7 - Faça uma função que some os valores de dois vetores de tamanho N, ambos recebidos por parâmetro,
        // e retorne um outro vetor, também de tamanho N, com o resultado da soma dos dois vetores, só que ao contrário.
        
public class SomaVetoresInvertidos {

    public static int[] somarInvertido(int[] vetor1, int[] vetor2) {
        int N = vetor1.length;
        int[] resultado = new int[N];

        for (int i = 0; i < N; i++) {
            resultado[i] = vetor1[i] + vetor2[i];
        }

        for (int i = 0; i < N / 2; i++) {
            int temp = resultado[i];
            resultado[i] = resultado[N - 1 - i];
            resultado[N - 1 - i] = temp;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int N = scanner.nextInt();

        int[] vetor1 = new int[N];
        int[] vetor2 = new int[N];

        System.out.println("Digite os valores do primeiro vetor:");
        for (int i = 0; i < N; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor:");
        for (int i = 0; i < N; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int[] resultado = somarInvertido(vetor1, vetor2);

        
        System.out.print("Resultado da soma dos vetores invertido: ");
        for (int i = 0; i < N; i++) {
            System.out.print(resultado[i] + " ");
        }

        scanner.close();
    }
}
