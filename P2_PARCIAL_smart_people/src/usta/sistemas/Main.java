package usta.sistemas;

import java.util.Scanner;

public class Main {

    // AUTHOR: lUIS FERNANDO CASTELLANOS
    // DATE:  2020-MAY-28
    // DESCRIPTION: This software generates 12 wages for N employees. Determines what was the employee with the highest wage,
    // the value of the total of wages and the average.
    public static int [][] matrix_wages;       //matrix with N (rows) x 12 months(columns)
    public static int [] vector_wages_employee;  //N employees


    public static void main(String[] args) {
	    f_menu_N_employees();
	    f_fill_matrix_wages();
	    f_calculates_total_wages();
	    f_show_rich_employee();
    }

    public static void f_menu_N_employees() {
        //DESCRIPTION: This method show the initial menu and determines who many N rows
        System.out.println("╔════════════════════════════╗");
        System.out.println("║        SoftWagesEmployees  ║");
        System.out.println("║ Maker:LuisFdo Castellanosg ║");
        System.out.println("║ Date: 2020-may-28          ║");
        System.out.println("╚════════════════════════════╝");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many employees do you need?");
        int total_employees = keyboard.nextInt();
        while (total_employees <= 0) {
            System.out.println("ERR: The value must be greater than 0");
            System.out.println("Input again the number of employees");
            total_employees = keyboard.nextInt();
        }
        matrix_wages = new int[total_employees][12];
        vector_wages_employee= new int[total_employees];
    }

    public static void f_fill_matrix_wages(){
        //DESCRIPTION: this method fills the matrix with values between SMLV and SMLV*5
        for(int i=0;i<matrix_wages.length;i++){
            for(int j=0;j<matrix_wages[0].length;j++){
                matrix_wages[i][j]= (int) Math.floor((Math.random()*(4439015-877803+1))+877803);
            }
        }
    }

    public static void f_calculates_total_wages(){
        //DESCRIPTION: this method calculates the total wages in the year
        for(int i=0;i<matrix_wages.length;i++){
            vector_wages_employee[i]=0;
            for(int j=0;j<matrix_wages[0].length;j++){
                vector_wages_employee[i]+=matrix_wages[i][j];
            }
        }
    }

    public static void f_show_rich_employee(){
        //DESCRIPTION: this methods show the employee that more money was paid
        int total_paid=vector_wages_employee[0];
        int employeed_winner=0, winner_money=vector_wages_employee[0];
        for(int i=1;i<vector_wages_employee.length;i++){

            total_paid+=vector_wages_employee[i];

            if (winner_money<vector_wages_employee[i]){
                employeed_winner=i;
                winner_money=vector_wages_employee[i];
            }
        }
        double average = total_paid/ (matrix_wages.length*matrix_wages[0].length);
        System.out.println("The total money was paid :$"+total_paid+" the average is: $"+average);
        System.out.println("the employee that more money was paid ="+(employeed_winner+1)+" $$ "+winner_money);
    }



}
