package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    /*AUTHOR:Luis Fernando Castellanos
	      DATE: 2020- April -23
	      DESCRIPTION:Records the times of each lap of training and determines the best lap, the average and the numbe
	       of laps per training (the laps will be until the athlete gets tired / exhausted)
	    */
	    int total_laps=0;
	    double best_lap=0, average, time_lap, summatory_time=0;
        f_menu();
	    while (f_continuar()==true){
	        total_laps+=1;
            time_lap=f_value_lap(total_laps);
            summatory_time+=time_lap;
	        if(total_laps==1){
                best_lap=time_lap;
            }if(time_lap<best_lap){
                best_lap=time_lap;
            }
        }
	    average=summatory_time/total_laps;
        System.out.println("The best lap: "+best_lap+", total laps: "+total_laps+" average time :"+average);

    }
    public static void f_menu(){
        //Description: this method show the menu of this software
        System.out.println("╔══════════════════════╗");
        System.out.println("║   SoftSportTime      ║");
        System.out.println("║Version 1.0 20200423  ║");
        System.out.println("║Created by: LFCG      ║");
        System.out.println("╚══════════════════════╝");
    }
    public static boolean f_continuar(){
        //Description: this method returns a boolean value true/false
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Do you want to continue the training (true/false):");
        boolean rpta= keyboard.nextBoolean();
        return rpta;
    }
    public static double f_value_lap(int lap){
        //description: this method return the time of a lap.
        Scanner keyboard= new Scanner(System.in);
        System.out.println("input the time ("+lap+") lap (seconds): ");
        double time= keyboard.nextDouble();
        while (time<1){
            System.err.println("ERR: The time must greater to be one ");
            System.out.println("input again the time ("+lap+") lap (seconds): ");
            time= keyboard.nextDouble();
        }
        return  time;
    }
}
