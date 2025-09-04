package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usuario = "admin";
        int senha = 1234;

        System.out.println("Informe o usuário: ");
        Scanner leiaUsuario = new Scanner(System.in);
        String user = leiaUsuario.nextLine();

        System.out.println("Informe a senha: ");
        int passoward = leiaUsuario.nextInt();

        if ( user == "admin" && passoward == 1234){
            System.out.println("Usuário válido");
            System.out.println("Seja bem vindo: " + user);
        } else {
            System.out.println("Usuário Inválido");
            System.out.println("Tente Novamente");
        }

    }
}