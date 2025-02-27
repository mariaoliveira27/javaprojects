import java.util.Scanner;

// 5 - A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e número de filhos.
        // Faça um método que leia esses dados para um número não determinado de pessoas, calcule e exiba a média de salário da população.
        // A condição de parada pode ser um flag ou a quantidade N.
public class Prefeitura {
    public void calcularMediaSalarial(){
        Scanner sc = new Scanner(System.in);

        double totalSalarios = 0;
        int quantidadePessoas = 0;

        while(true){
            System.out.print("Digite o salário (ou -1 para encerrar): ");
            double salario = sc.nextDouble();
            
            if(salario == -1){
                break;
            }
            System.out.print("Digite o numero de dependentes: ");
            int dependentes = sc.nextInt();

            totalSalarios += salario;
            quantidadePessoas++;
        }

        if(quantidadePessoas > 0){
            double media = totalSalarios / quantidadePessoas;
            System.out.println("Média salarial: " + media);
    }else {
        System.out.println("Nenhum salário foi informado.");
    }
    sc.close();
    }
    public static void main(String[] args) {
        Prefeitura prefeitura = new Prefeitura();
        prefeitura.calcularMediaSalarial();

}
}