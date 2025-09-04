package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leiaPalavra = new Scanner(System.in);
        System.out.println("Informe 2 palavras para verificar se são iguais: ");
        System.out.println("1° palavra: ");
        String phrase = leiaPalavra.nextLine();
        System.out.println("2° palavra: ");
        String phrase2 = leiaPalavra.nextLine();

        if (phrase.equals(phrase2)){
            System.out.println("As palavras são iguais!");
        } else {
            System.out.println("\nNão são iguais");
        }

        System.out.println("As palavras informadas foram: " + phrase + " e " + phrase2);




    }
}