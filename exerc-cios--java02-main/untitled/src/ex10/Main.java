package ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner readUser = new Scanner(System.in);

        System.out.println("Informe uma camisa");
        System.out.println("1 - Camisa Vermelha = R$30.00");
        System.out.println("2 - Camisa Azul = R$35.00");
        System.out.println("3 - Camisa Preta = R$40.00");
        System.out.println("4 - Camisa Verde = R$50.00");

        System.out.print("Digite sua escolha: ");
        int user = readUser.nextInt();

        String item = "";
        double preco = 0.0;
        switch (user) {
            case 1:
                item = "Camisa Vermelha";
                preco = 30.00;
                break;
            case 2:
                item = "Camisa Azul";
                preco = 35.00;
                break;
            case 3:
                item = "Camisa Preta";
                preco = 40.00;
                break;
            case 4:
                item = "Camisa Verde";
                preco = 50.00;
                break;
            default:
                System.out.println("Opção inválida! Escolha um número entre 1 e 4.");
                return;
        }

        System.out.println("Seu pedido foi:\n" + item + " " + "R$" + preco);
    }
}
