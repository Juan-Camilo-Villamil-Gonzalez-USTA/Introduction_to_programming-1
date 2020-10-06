import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("║P2T5. substract between two numbers, make by luis Fdo Castellanos  ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input de first number:");
        int num1 = keyboard.nextInt();

        System.out.println("Input de second number:");
        int num2 = keyboard.nextInt();

        int resu= num1- num2;

        System.out.println("The substract is "+resu);
    }
}
