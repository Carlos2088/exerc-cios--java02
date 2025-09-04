package ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inform one age to know if needs to vote or no: ");
        Scanner readAge = new Scanner(System.in);
        int age = readAge.nextInt();

        if (age < 16){
            System.out.println("Voto não é obrigatório");
        } else if ( age >= 16 && age <=18){
            System.out.println("Voto é opicional");
        } else if (age >= 18 && age <= 70) {
            System.out.println("Voto é obrigatório");
        } else {
            System.out.println("Voto é opcional");
        }
    }
}
