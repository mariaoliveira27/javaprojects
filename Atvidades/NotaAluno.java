import java.util.Scanner;

// 4 - Faça um método que recebe as 3 notas de um aluno por parâmetro e uma letra.
        // Se a letra for ‘A’, o procedimento calcula e escreve a média aritmética das notas do aluno,
        // se for ‘P’, calcula e escreve a sua média ponderada (pesos: 5, 3 e 2).
        // Faça um programa que leia 3 notas de N alunos e acione o procedimento para cada aluno (N deve ser lido do teclado).
        
public class NotaAluno {

    public static double calcularMediaAritmetica(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static double calcularMediaPonderada(double nota1, double nota2, double nota3) {
        return (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de alunos: ");
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");

            double nota1 = lerNota(scanner, 1);
            double nota2 = lerNota(scanner, 2);
            double nota3 = lerNota(scanner, 3);

            System.out.print("Digite 'A' para média aritmética ou 'P' para média ponderada: ");
            char letra = scanner.next().charAt(0);

            if (letra == 'A') {
                double media = calcularMediaAritmetica(nota1, nota2, nota3);
                System.out.println("Média Aritmética: " + media);
            } else if (letra == 'P') {
                double mediaPonderada = calcularMediaPonderada(nota1, nota2, nota3);
                System.out.println("Média Ponderada: " + mediaPonderada);
            } else {
                System.out.println("Opção inválida. Informe 'A' para média aritmética ou 'P' para média ponderada.");
            }
        }

        scanner.close();
    }

    public static double lerNota(Scanner scanner, int numeroNota) {
        System.out.print("Digite a nota " + numeroNota + ": ");
        return scanner.nextDouble();
    }
}
