package usta.sistemas;

import javax.swing.plaf.synth.SynthMenuBarUI;
import java.util.Scanner;

public class Main {
    // AUTHOR: lUIS FERNANDO CASTELLANOS
    // DATE:  2020-MAY-05
    // DESCRIPTION:this program simulate the data of a swimming competition where the ten times are stored for each
    // competitor and also determine based on all the times of the competitors who is the winner
    public static void main(String[] args) {
        int total_competitors=f_menu_total_competitors();
        double[][] matrix_competition=f_fill_matrix_competition(total_competitors);
        String texto="";
        System.out.println("---------the times of competition----------");
        System.out.println("player | T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8  | T9 | T10 ");
        for (int i=0;i<total_competitors;i++){  //recorrer filas
            texto+="\n"+(i+1);
            for (int j=0; j<10 ;j++){           //recorrer las columnas
                texto+=" | "+matrix_competition[i][j]+" ";
            }
        }
        System.out.println(texto);

    }
    public static int f_menu_total_competitors() {
        //DESCRIPTION: This method show the initial menu and returns the total competitors
        Scanner keyboard= new Scanner(System.in);
        System.out.println("╔════════════════════════════╗");
        System.out.println("║  SoftSwimmingCompetition   ║");
        System.out.println("║ Maker:LuisFdo Castellanosg ║");
        System.out.println("║ Date: 2020-may-12          ║");
        System.out.println("╚════════════════════════════╝");
        System.out.println("input who many competitors do you want?");
        int total_competitors= keyboard.nextInt();
        while (total_competitors<=0){
            System.err.println("ERR: the  value must greater than zero");
            System.out.println("input Again who many competitors do you want?");
            total_competitors= keyboard.nextInt();
        }
        return total_competitors;
    }

    public static double[][] f_fill_matrix_competition(int total_competitors){
        //description: this methods returns a fill matrix of time the competition
        double[][] matrix_competition = new double[total_competitors][10];
        for (int i=0; i<total_competitors;i++){ //para recorrer las filas (competidores)
            for (int j=0; j<10;j++){            //para recorrer las columnas (tiempos)
                matrix_competition[i][j]= Math.floor(Math.random()*(10-6)+6); //randomicos entre 6.0 y 10.0
            }
        }
        return matrix_competition;
    }
}
