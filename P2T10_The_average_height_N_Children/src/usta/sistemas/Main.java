package usta.sistemas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*AUTHOR:Luis Fernando Castellanos
	      DATE: 2020- April -20
	      DESCRIPTION:This software Calculates the average height of a group of N children and generated the average
	    */
	    f_menu();
	    int total_children= f_total_children();
	    double summatory=0,average=0;
        for (int i=1;i<=total_children;i=i+1 ) {
            summatory=summatory+f_height_child(i);
        }
        average=summatory/total_children;
        System.out.println("The average of height is:"+average+" (mts)");
    }
    public static void f_menu(){
        //Description: this method show the menu of this software
        System.out.println("╔══════════════════════╗");
        System.out.println("║  SoftAverageHeight   ║");
        System.out.println("║Version 1.0 20200420  ║");
        System.out.println("║Created by: LFCG      ║");
        System.out.println("╚══════════════════════╝");

    }
    public static int f_total_children(){
        //Description: this method return the total children
        System.out.println("Input the total children to calculate the height: ");
        Scanner keyboard= new Scanner(System.in);
        int children=keyboard.nextInt();
        while(children<1){
            System.err.println("Err: the value should be greater than zero");
            System.out.println("Input again the total children to calculate the height: ");
            children=keyboard.nextInt();
        }
        return children;
    }
    public static double f_height_child(int i){
        //Description: this method return the height of a child.
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input the height (mts) of child ("+i+"):");
        double height= keyboard.nextDouble();
        while (height<0.2 || height>2){ // 20 cm o 2 mts
            System.err.println("ERR: the values should be between 0.2 and 2 mts");
            System.out.println("Input again the height (mts) of child ("+i+"):");
            height= keyboard.nextDouble();
        }
        return height;
    }
}
