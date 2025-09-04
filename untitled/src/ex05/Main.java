package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leiaPalavra = new Scanner(System.in);
        System.out.println("Informe uma palavra para verificar se começa com vogal: ");
        String phrase = leiaPalavra.nextLine();

        if (phrase.startsWith("a") || phrase.startsWith("e") || phrase.startsWith("i") || phrase.startsWith("o") || phrase.startsWith("u")){

            System.out.println("A palavra informa começa com vogal!");
        } else if (Character.isLetter(phrase.charAt(0))){
            System.out.println("A palavra informada começa com uma consoante");
        } else {
            System.out.println("A palavra informada não começa com uma letra!");
        }


    }
}
