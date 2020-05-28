package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{

            Scanner keyboard= new Scanner(System.in);
            System.out.println("input de first number:");
            int number1 = keyboard.nextInt();
            System.out.println("input de second number:");
            int number2 = keyboard.nextInt();

            int number3= number1+number2;
            System.out.println("The sum is: "+number3);

        } catch (Exception e) {
            System.err.println("ERR: the software allow only number not words (public static void main): "+e.toString());
        }
    }
}
