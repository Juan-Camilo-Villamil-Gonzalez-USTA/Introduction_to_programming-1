package usta.sistemas;

import java.util.Scanner;    //libreria necesaria para usar el teclado de la computadora.

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Angel Manuel Correa Rivera
	    DATE: 25/03/2020
	    DESCRIPTION: This program helps people to determine if they have Covid 19.
	 */
        Scanner keyboard = new Scanner(System.in);
        int Cough, Body_ache, Difficulty_breathing, Age;
        double Degrees;

        System.out.println("--------------------------------------------------------------------");
        System.out.println("                             Dr.Coranovirus");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("This software determinated if you have coronavirus (COVID-19 ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println(" Created by: Luis fernando castellanos ");
        System.out.println("--------------------------------------------------------------------");

        System.out.println(" Input your age: ");
        Age = keyboard.nextInt();
        System.out.println("Nest you were asked about the different symptoms of Covid19, please answer with 1 for YES and 0 for NO, Do you have a dry cough?");
        Cough = keyboard.nextInt();
        System.out.println("Do you have body pain? yes(1) Not(0):");
        Body_ache = keyboard.nextInt();
        System.out.println("Do you have trouble breathing? yes(1) Not(0):");
        Difficulty_breathing = keyboard.nextInt();
        System.out.println("What is your temperature? In degrees:");
        Degrees = keyboard.nextDouble();
        //verificamos que el usuario ingresera bien los datos (0 o 1)
        if (Cough < 0 || Cough > 1 || Body_ache < 0 || Body_ache > 1 || Difficulty_breathing < 0 || Difficulty_breathing > 1) {
            System.err.println("ERROR: The answer must be 0 or 1");
        } else {  //si el usuario ingreso los datos correctos.

            if (Cough == 1 && Body_ache == 1 && Difficulty_breathing == 1 && Degrees > 38) {
                System.out.println("You have the symptoms of COVID19");
                if (Age >= 60) {
                    System.out.println("URGENT: Do you need to go at Hospital or your EPS");
                } else {
                    System.out.println("RELAX: you need to be in isolation at home");
                }

            } else { //sino tiene los sintomas
                System.out.println("You don´t have anu symptoms, stay home");
            }
        }

        System.out.println("This software was created by Angel Manuel Correa Rivera, please stay home, take care.");

    }
}
