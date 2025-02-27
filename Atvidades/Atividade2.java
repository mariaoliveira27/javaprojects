public class Atividade2 {

    // 2 - Elabore um programa que preencha com 10 elementos do tipo inteiro em um vetor A.
        // Crie um vetor ParImpar de 2 posições e armazene no índice 0 quantos elementos de A são par
        // e no índice 1 quantos elementos de A são ímpar. Ao final, imprima o vetor ParImpar.
        
    
    int[] vetorA = new int[10];
    int[] vetorParImpar = new int[2];
    public void preencherVetor(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i + 1;
        }

    }
    public void separarParImpar(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                vetorParImpar[0] += 1;
            }else{
                vetorParImpar[1] += 1;
            }
        }
    }
    public void imprimirVetor(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
    public void imprimirVetorParImpar(int[] vetor){
        System.out.println("Quantidade de números pares: " + vetor[0]);
        System.out.println("Quantidade de números ímpares: " + vetor[1]);
    }
    public static void main(String[] args) {
        Atividade2 atividade2 = new Atividade2();
        atividade2.preencherVetor(atividade2.vetorA);
        atividade2.separarParImpar(atividade2.vetorA);
        atividade2.imprimirVetor(atividade2.vetorA);
        atividade2.imprimirVetorParImpar(atividade2.vetorParImpar);
    }
}
