package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Informe seu e-mail");
        Scanner leiaEmail = new Scanner(System.in);
        String email = leiaEmail.nextLine();
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Seu e-mail é válido");
        }  else {
            System.out.println("Seu e-mail está inválido!");
        }


    }

}