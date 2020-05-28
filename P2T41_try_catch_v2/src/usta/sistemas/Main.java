package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean b_funciona=false;
        do {
            try {
                Scanner keyboard= new Scanner(System.in);
                System.out.println("input the total people");
                int total_people=keyboard.nextInt();
                b_funciona=true;

            } catch (Exception e) {
                System.err.println("ERR: this software allowed only number");
            }

        }while (b_funciona==false);
    }
}
