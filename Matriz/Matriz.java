package Matriz;

import java.util.Scanner;

public class Matriz {
    private int linha;
    private int coluna;
    private int[][] matriz;

   public void criarMatriz(int linha, int coluna){
    this.coluna = coluna;
    this.linha = linha;
    matriz = new int[linha][coluna];

   } 

   public void preencherMatriz(int[][] matriz){
    this.matriz = matriz;

   }
   public void preencherMatrizTeclado(Scanner scanner) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("Enter value for matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
   }
    public void imprimirMatriz(){
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void multiplicarCopiaMatrizPorConstate(int constante){
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                matriz[i][j] = matriz[i][j] * constante;
            }
        }
    }

    
}
