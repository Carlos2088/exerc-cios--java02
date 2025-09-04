package ex08;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();
        System.out.print("Digite a nota do primeiro trabalho: ");
        double notaTrabalho1 = scanner.nextDouble();
        System.out.print("Digite a nota do segundo trabalho: ");
        double notaTrabalho2 = scanner.nextDouble();

        double media = (notaProva1 * 7 + notaProva2 * 7 + notaTrabalho1 * 3 + notaTrabalho2 * 3) / 20;

        String status;
        if (media >= 6) {
            status = "aprovado";
        } else if (media >= 5 && media < 6) {
            status = "em recuperação";
        } else {
            status = "reprovado";
        }

        System.out.println("Aluno " + nome + " " + status + "  sua média foi: " + media);


    }
}
