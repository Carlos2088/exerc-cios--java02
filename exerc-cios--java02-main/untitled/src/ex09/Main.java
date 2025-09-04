package ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leiaUser = new Scanner(System.in);

        System.out.println("Bem-vindo");
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1 - Pizza de Calabresa (R$ 40.00)");
        System.out.println("2 - Pizza de Mussarela (R$ 38.00)");
        System.out.println("3 - Pizza de Frango (R$ 42.00)");
        System.out.println("4 - Refrigerante (R$ 8.00)");
        System.out.println("5 - Suco (R$ 10.00)");

        System.out.print("Digite sua escolha: ");
        int user = leiaUser.nextInt();

        String item = "";
        double preco = 0.0;
        switch (user) {
            case 1:
                item = "Pizza de Calabresa";
                preco = 40.00;
                break;
            case 2:
                item = "Pizza de Mussarela";
                preco = 38.00;
                break;
            case 3:
                item = "Pizza de Frango";
                preco = 42.00;
                break;
            case 4:
                item = "Refrigerante";
                preco = 8.00;
                break;
            case 5:
                item = "Suco";
                preco = 10.00;
                break;
            default:
                System.out.println("Opção inválida! Escolha um número entre 1 e 5.");
                return;
        }

        System.out.println("Seu pedido foi:\n" + item + " " + "R$" + preco);

        leiaUser.close();
    }
}