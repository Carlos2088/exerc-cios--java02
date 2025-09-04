package ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inform one age to know if is child, teenage, adult: ");
        Scanner readAge = new Scanner(System.in);
        int age = readAge.nextInt();

        if (age < 12){
            System.out.println("Is a child");
        } else if (age >= 12 && age <=17){
            System.out.println("Is a teenage");
        } else {
           System.out.println("Is a adult");
        }
    }
}
