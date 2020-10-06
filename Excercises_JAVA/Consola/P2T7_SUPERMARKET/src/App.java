
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║  P2T7: the supermarket, make by luis Fernando Castellanosg║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        
        int P1, P2, P3, P4, VALBR;
        double IVA, BILL;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input de FIRTS product:");
        P1 = keyboard.nextInt();

        System.out.println("Input de 2° product:");
        P2 = keyboard.nextInt();

        System.out.println("Input de 3° product:");
        P3 = keyboard.nextInt();

        System.out.println("Input de 4° product:");
        P4 = keyboard.nextInt();

        VALBR = P1+P2+P3+P4;

        IVA= VALBR *0.19;
        
        BILL = VALBR+IVA;

        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println(" The total bill is $"+ BILL+" whith IVA 19% $"+IVA);
        System.out.println("═══════════════════════════════════════════════════════════");


    }
}
