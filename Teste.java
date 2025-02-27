import java.util.Scanner;

public class Teste {
    public static int multiplicacao(int n, int b){
        return n * b;
    }
    public static int lerNumero(Scanner sc){
            System.out.print("Digite um número: ");
            return sc.nextInt();   
    }
    public static int[][] matriz(Scanner sc, int n, int b){
        int[][] matriz = new int[n][b];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < b; j++){
            // Fazer a leitura dos elementos da matriz
            System.out.print("Digite o elemento da linha " + i + " e coluna " + j + ": ");
            matriz[i][j] = sc.nextInt();
             
            }
        }
        return matriz;
    }
    public static void imprimirMatriz(int[][] matriz){

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++ ){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = lerNumero(sc);
        int b = lerNumero(sc);
        int r = multiplicacao(n, b);
        System.out.println("Resultado 1: " + r);

        int[][] matriz = matriz(sc, n, b);
        System.out.println("Matriz: ");
        imprimirMatriz(matriz);

        sc.close();
    }
}
