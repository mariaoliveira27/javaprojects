import java.util.Scanner;

// 6 - Faça um procedimento que recebe 3 valores inteiros por parâmetro e os exiba em ordem crescente.
        // Faça um programa que leia N conjuntos de 3 valores e acione o procedimento para cada conjunto (N deve ser lido do teclado).
        

public class OrdenacaoValores {
    
    public static  void ordernarEMostrarValores(int a, int b, int c){
            int aux;
            if(a > b){
                aux = a;
                a = b;
                b = aux;
            }
            if(a > c){
                aux = a;
                a = c;
                c = aux;
            }
            if(b > c){
                aux = b;
                b = c;
                c = aux;
            }
            System.out.println(a + " " + b + " " + c);
        }
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            
             System.out.print("Digite o numero de conjuntos: ");
             int N = sc.nextInt();
             for(int i = 0; i<N; i++){
                System.out.print("Digite os 3 valores do conjunto: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
    
                ordernarEMostrarValores(a, b, c);
         }
            sc.close();
    }
}
