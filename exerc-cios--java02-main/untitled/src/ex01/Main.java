package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe uma palavra para verificar se é grande ou pequena: ");
        Scanner leiaPalavra = new Scanner(System.in);
        String palavra = leiaPalavra.nextLine();

        if (palavra.length() < 20){
            System.out.println("A palavra é pequena!");
        } else {
            System.out.println("A palavra é grande!");
        }

    }
}