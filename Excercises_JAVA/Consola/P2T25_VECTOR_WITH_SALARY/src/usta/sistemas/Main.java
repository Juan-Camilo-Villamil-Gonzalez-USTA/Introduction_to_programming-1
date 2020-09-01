package usta.sistemas;

import  java.util.Random;

public class Main {

    public static void main(String[] args) {
        // AUTHOR: lUIS FERNANDO CASTELLANOS
        // DATE:  2020-MAY-04
        // DESCRIPTION: Saves the salaries of 5 employees using an arrangement (vector), where the salaries are a random value between $ 1,000,000 and $ 2,000,000
        f_menu();
        int[] salary_of_employees= f_sueldos();
        f_show_sueldos(salary_of_employees);
    }

    public static void f_menu() {
        //DESCRIPTION: This method contain the menu of the software
        System.out.println("╔════════════════════════════╗");
        System.out.println("║    SoftVectorSalalry       ║");
        System.out.println("║ Maker:LuisFdo Castellanosg ║");
        System.out.println("║ Date: 2020-may-04          ║");
        System.out.println("╚════════════════════════════╝");
    }

    public static int[] f_sueldos(){
        //Description: this method returns a vector with salary of five employees
        Random rand= new Random();
        int[] salary = new int[5]; //this var to save the salary of five employees
        /*salary[0]= (int) Math.floor(Math.random()*(2000000-1000000+1)+1000000);
        salary[1]= (int) Math.floor(Math.random()*(2000000-1000000+1)+1000000);
        salary[2]= (int) Math.floor(Math.random()*(2000000-1000000+1)+1000000);
        salary[3]= (int) Math.floor(Math.random()*(2000000-1000000+1)+1000000);
        salary[4]= (int) Math.floor(Math.random()*(2000000-1000000+1)+1000000);*/
        for(int i=0;i<5;i++){
            salary[i]= (int) Math.floor(Math.random()*(2000000-1000000+1)+1000000);
        }
        return  salary;

    }

    public static void f_show_sueldos(int[] salary){
        //description: this method show the vector with the salary
        System.out.println("-----the list of salary is:------");
        for(int i=0;i<5;i++){
            System.out.println("the salary of employed ("+(i+1)+") is :"+salary[i]);
        }
    }
}
