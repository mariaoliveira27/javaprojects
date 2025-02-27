import java.util.Scanner;

public class Vetor1 {
    
    // 1 - Faça um programa que leia um vetor A com 15 elementos inteiros.
        // Em seguida, construa um vetor B do mesmo tipo, em que cada elemento de B deva ser o resultado do fatorial
        // correspondente de cada elemento de A. Imprima na tela os vetores A e B.
   public int[] lerVetor(){
    Scanner scanner = new Scanner(System.in);
    int[] vetorA = new int[15];

    System.out.println("Digite 15 valores para o vetor A: ");
    for(int i = 0; i < 15; i++){
        System.out.print("Digite o valor " + (i + 1) + ": ");
        vetorA[i] = scanner.nextInt();
    }
    return vetorA;
   }

   public long calculoFatorial(int n){
         long fatorial = 1;
         for(int i = 1; i <= n; i++){
              fatorial = fatorial * i;
         }
         return fatorial;
   }
   public long[] calcularFatoriais(int [] vetorA){
    long[] vetorB = new long[vetorA.length];
    for(int i = 0; i < vetorA.length; i++){
        vetorB[i] = calculoFatorial(vetorA[i]);
    }
    return vetorB;
   }

   public void imprimirVetor(int[] vetor){
    
    for(int i = 0; i < vetor.length; i++){
        System.out.print(vetor[i] + " ");
    }
    System.out.println();
   }
    public void exibirVetorFatoriais(long[] vetor){
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Vetor1 vetor1 = new Vetor1();
        int[] vetorA = vetor1.lerVetor();
        long[] vetorB = vetor1.calcularFatoriais(vetorA);
        vetor1.imprimirVetor(vetorA);
        vetor1.exibirVetorFatoriais(vetorB);
    }
    
}
