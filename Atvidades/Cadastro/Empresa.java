package Cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Empresa {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void lerTeclado(Scanner scanner) {
        System.out.println("Informe os dados de pelo menos 10 funcionários: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine();  // Consumir a quebra de linha pendente

            System.out.print("Data de Nascimento (dd/MM/yyyy): ");
            String dataNascimento = scanner.nextLine();

            funcionarios.add(new Funcionario(nome, sexo, dataNascimento));
        }

        gerarRelatorio();
    }

    private void gerarRelatorio() {
        int totalFuncionarios = funcionarios.size();
        int totalFeminino = 0, totalMasculino = 0;
        int somarIdades = 0, somarIdadesMasculino = 0, somarIdadesFeminino = 0;

        System.out.println("\nRelatório de Funcionários:");
        System.out.printf("%-20s %-10s %-15s %5s\n", "Nome", "Sexo", "Data de Nascimento", "Idade");
        System.out.println("------------------------------------------------------------");

        for (Funcionario f : funcionarios) {
            int idade = f.getIdade();
            somarIdades += idade;

            if (f.getSexo() == 'F') {
                totalFeminino++;
                somarIdadesFeminino += idade;
            } else if (f.getSexo() == 'M') {
                totalMasculino++;
                somarIdadesMasculino += idade;
            }

            System.out.printf("%-20s %-10s %-15s %-5d\n",
                    f.getNome(), f.getSexo(), f.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), idade);
        }

        double percentualFeminino = (totalFuncionarios > 0) ? ((double) totalFeminino * 100) / totalFuncionarios : 0;
        double percentualMasculino = (totalFuncionarios > 0) ? ((double) totalMasculino * 100) / totalFuncionarios : 0;
        double idadeMediaGeral = (totalFuncionarios > 0) ? (double) somarIdades / totalFuncionarios : 0;
        double idadeMediaFeminino = (totalFeminino > 0) ? (double) somarIdadesFeminino / totalFeminino : 0;
        double idadeMediaMasculino = (totalMasculino > 0) ? (double) somarIdadesMasculino / totalMasculino : 0;

        System.out.println("\nResumo do Relatório:");
        System.out.printf("Total de Funcionários: %d\n", totalFuncionarios);
        System.out.printf("Total de Funcionários do Sexo Feminino: %d (%.2f%%)\n", totalFeminino, percentualFeminino);
        System.out.printf("Total de Funcionários do Sexo Masculino: %d (%.2f%%)\n", totalMasculino, percentualMasculino);
        System.out.printf("Idade Média Geral: %.2f anos\n", idadeMediaGeral);
        System.out.printf("Idade Média do Sexo Feminino: %.2f anos\n", idadeMediaFeminino);
        System.out.printf("Idade Média do Sexo Masculino: %.2f anos\n", idadeMediaMasculino);
        System.out.println("------------------------------------------------------------");
    }
}
