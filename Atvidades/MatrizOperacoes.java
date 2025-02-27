
// 8 - Considere a Matriz A abaixo:
        // a) Implemente um algoritmo que exiba a matriz transposta AT
        // b) Implemente um algoritmo que exiba a soma dos quadrados da diagonal secundária
        // c) Implemente um algoritmo que faça a multiplicação desta matriz por uma constante C
        // d) Implemente um algoritmo que inverta a 3ª linha com a 3ª coluna
        

public class MatrizOperacoes {

    public static void main(String[] args) {
        // Matriz fornecida
        int[][] matriz = {
            {5, 10, 7, 8},
            {13, 4, 1, 3},
            {9, 2, 6, 5},
            {10, 7, 4, 9}
        };

        // a) Exibir a matriz transposta
        exibirTransposta(matriz);
        
        // b) Exibir a soma dos quadrados da diagonal secundária
        somaQuadradosDiagonalSecundaria(matriz);
        
        // c) Multiplicar a matriz por uma constante
        int constante = 3;  // Constante C para multiplicação
        multiplicarPorConstante(matriz, constante);
        
        // d) Inverter a 3ª linha com a 3ª coluna
        inverterLinhaColuna(matriz);
    }

    // a) Função para exibir a matriz transposta
    public static void exibirTransposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        System.out.println("a) Matriz Transposta:");
        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // b) Função para calcular e exibir a soma dos quadrados da diagonal secundária
    public static void somaQuadradosDiagonalSecundaria(int[][] matriz) {
        int soma = 0;
        int n = matriz.length;
        
        System.out.println("b) Soma dos quadrados da diagonal secundária:");
        for (int i = 0; i < n; i++) {
            soma += Math.pow(matriz[i][n - 1 - i], 2);  // Soma os quadrados
        }
        System.out.println("Soma dos quadrados da diagonal secundária: " + soma);
        System.out.println();
    }

    // c) Função para multiplicar a matriz por uma constante
    public static void multiplicarPorConstante(int[][] matriz, int constante) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        System.out.println("c) Matriz multiplicada por " + constante + ":");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] * constante + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // d) Função para inverter a 3ª linha com a 3ª coluna
    public static void inverterLinhaColuna(int[][] matriz) {
        int n = matriz.length;
        
        System.out.println("d) Matriz após inverter a 3ª linha com a 3ª coluna:");
        for (int i = 0; i < n; i++) {
            int temp = matriz[2][i];  
            matriz[2][i] = matriz[i][2];  
            matriz[i][2] = temp;  
        }

        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[x][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
