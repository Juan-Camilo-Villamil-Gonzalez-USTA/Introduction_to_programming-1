package usta.sistemas;

public class Main {

    public static void main(String[] args) {
        // AUTHOR: lUIS FERNANDO CASTELLANOS
        // DATE:  2020-MAY-04
        // DESCRIPTION:to create a program in JAVA that allows storing the salaries of the employees grouped by shift.
        f_menu();
        int[] turn_morning= f_salary_turn(); //this vector if by turn of morning (8 employees)
        int[] turn_afternoon=f_salary_turn();//this vector if by turn of afternoon (8 employees)
        int salary_total_morning= f_show_salary_morning(turn_morning);
        int salary_total_afternoon= f_show_salary_afternoon(turn_afternoon);
        System.out.println("The total salary (morning + afternoon)= "+(salary_total_afternoon+salary_total_morning));

    }
    public static void f_menu() {
        //DESCRIPTION: This method contain the menu of the software
        System.out.println("╔════════════════════════════╗");
        System.out.println("║  SoftTwoVectorSalalry      ║");
        System.out.println("║ Maker:LuisFdo Castellanosg ║");
        System.out.println("║ Date: 2020-may-04          ║");
        System.out.println("╚════════════════════════════╝");
    }
    public static  int[] f_salary_turn(){
        //description: this method returns the salary of 8 employees
        int[] salary= new int[8];
        // i=i+1 => i+=1 => i++;
        for (int i=0; i<8; i+=1){
            salary[i]= (int) Math.floor(Math.random()*(2000000-980658)+980658);
        }
        return salary;
    }
    public static int f_show_salary_morning(int[] turn_morning){
        //description: this method show the salary by turn of morning
        System.out.println("-------turn of morning------");
        int total_salary=0;
        for (int i=0; i<8; i+=1){
            total_salary+=turn_morning[i];
            System.out.println("the salary of employed ("+(i+1)+") :"+turn_morning[i]);
        }
        System.out.println("the total salary by turn of morning is: "+total_salary);
        return total_salary;
    }
    public static int f_show_salary_afternoon(int[] turn_afternoon){
        //description: this method show the salary by turn of afternoon
        System.out.println("-------turn of afternoon------");
        int total_salary=0;
        for (int i=0; i<8; i+=1){
            total_salary+=turn_afternoon[i];
            System.out.println("the salary of employed ("+(i+1)+") :"+turn_afternoon[i]);
        }
        System.out.println("the total salary by turn of afternoon is: "+total_salary);
        return total_salary;
    }
}
