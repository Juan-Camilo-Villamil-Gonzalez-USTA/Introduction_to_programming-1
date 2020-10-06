//AUTHOR:  Luis Fdo castellanos
//DATE:  2020-oct-06
//DESCRIPTION: this program show the age of a person
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("║P2T7. Age of a person, make by luis Fdo Castellanos                ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");

        Scanner teclado = new Scanner (System.in);

        System.out.println("Input your year birth: ");
        int YEAR = teclado.nextInt();

        if(YEAR>=2020){
           System.err.println("ERR: this year can't process,  you should input a year less than 2020"); 
        }else{
         
            int AGE= 2020-YEAR;

            if(AGE>=18){

                System.out.println(" she/he is  a adult");

            }else{

                System.out.println("  she/he is a kid/girl ");

            }

            
        }
    }
}
