package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Luis fernando castellanos
       DATE: 2020 - march -31
       DESCRIPTION: this software determine the time it takes a person to get from one city to another by bicycle
    */
	    Scanner keyboard= new Scanner(System.in);
        System.out.println("--------soft velocity---------");
        System.out.println("|  versión: 1.0               |");
        System.out.println("|  Maker if: Luis Fdo Castell |");
        System.out.println("-------------------------------");
        double velocity;
        System.out.println("input de constant velocity (km):");
        velocity=keyboard.nextDouble();

        f_time(velocity);

    }

    public static void f_time(double velocity){
       /*Description: this function calculate the time  t: d*v */
        Scanner keyboard= new Scanner(System.in);
        double time, distance;

        System.out.println("input distance:");
        distance=keyboard.nextInt();

        time= distance/velocity;
        System.out.println("the time is: "+Math.round(time) +" hours ");

    }

}


