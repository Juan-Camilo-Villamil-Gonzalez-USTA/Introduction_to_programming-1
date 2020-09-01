package usta.sistemas;

import java.util.Scanner;

public class Main {
    // AUTHOR: lUIS FERNANDO CASTELLANOS
    // DATE:  2020-MAY-13
    // DESCRIPTION:this program simulate rate food in the Giordano Bruno building cafeteria. For this,
    // a scale of 1 to 10 was defined (1 denotes horrible and 10 denotes excellent)
    public static Scanner keyboard= new Scanner(System.in);

    public static void main(String[] args) {
	    int total_students= f_menu_total_students();
        int[][] rates_matrix=f_fill_rates_matrix(total_students);
        f_show_bad_rates(rates_matrix);
        f_show_regular_rates(rates_matrix);
        f_show_excellent_rates(rates_matrix);
    }

    public static int f_menu_total_students() {
        //DESCRIPTION: This method show the initial menu and returns the total students

        System.out.println("╔════════════════════════════╗");
        System.out.println("║       SoftRatesFoods       ║");
        System.out.println("║ Maker:LuisFdo Castellanosg ║");
        System.out.println("║ Date: 2020-may-13          ║");
        System.out.println("╚════════════════════════════╝");
        System.out.println("input who many students do you want by rate food?");
        int total_students= keyboard.nextInt();
        while (total_students<=0){
            System.err.println("ERR: the  value must greater than zero");
            System.out.println("input Again who many students do you want?");
            total_students= keyboard.nextInt();
        }
        return total_students;
    }
    public static int[][] f_fill_rates_matrix(int total_students){
        //description: this method returns a matrix with rates of N students
        int[][] rates_matrix= new int[total_students][20];
        for (int i=0;i<total_students;i++){  //recorrer las filas
            for(int r=0;r<20;r++){
                rates_matrix[i][r]=(int) Math.floor((Math.random()*10)+1);
            }
        }
        return rates_matrix;
    }
    public static void f_show_bad_rates(int[][] rates_matrix){
        //description: this method show the bad rates (<=3)
        int total_bad_rates=0;
        for (int e=0;e<rates_matrix.length;e++){
            for(int r=0; r<20;r++){
                if(rates_matrix[e][r]<=3){
                    total_bad_rates++;
                }
            }
        }
        double percent= (total_bad_rates*100) / (rates_matrix.length*20);
        System.out.println("Total bad rates (<=3): "+total_bad_rates+", percent : %"+percent);
    }
    public static void f_show_regular_rates(int[][] rates_matrix){
        //description: this method show the regular rates (between 4 and 6)
        int total_regular_rates=0;
        for (int e=0;e<rates_matrix.length;e++){
            for(int r=0; r<20;r++){
                if(rates_matrix[e][r] >=4 && rates_matrix[e][r] <=6){
                    total_regular_rates++;
                }
            }
        }
        double percent= (total_regular_rates*100) / (rates_matrix.length*20);
        System.out.println("Total regular rates (>=4 and <=6): "+total_regular_rates+", percent : %"+percent);
    }
    public static void f_show_excellent_rates(int[][] rates_matrix){
        //description: this method show the excellent rates (greater or same than 7)
        int total_excellent_rates=0;
        for (int e=0;e<rates_matrix.length;e++){
            for(int r=0; r<20;r++){
                if(rates_matrix[e][r] >=7 ){
                    total_excellent_rates++;
                }
            }
        }
        double percent= (total_excellent_rates*100) / (rates_matrix.length*20);
        System.out.println("Total excellent rates (greater or same than 7): "+total_excellent_rates+", percent : %"+percent);
    }
}
