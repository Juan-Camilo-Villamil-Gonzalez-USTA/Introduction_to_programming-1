package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Luis Fernando Castellanos G
	  DATE: 2020 april 01
	  DESCRIPTION:This programm determines how much money a person saves in a year if you consider that each week you save 15% of your salary
	 */
	    Scanner keyboard = new Scanner(System.in);

	    f_menu();  //llamo la metodo/función llamado f_menu();

        System.out.println("input your salary:");
        int salary = keyboard.nextInt();
        f_saved_money(salary);  //llamo la metodo/función llamado f_saved_money();
    }

    public static void f_menu(){
        //Description: show the menú
        System.out.println("...............................");
        System.out.println(".       SoftSaveMoney         .");
        System.out.println(". Version: 1.0 --2020-ap-01   .");
        System.out.println(". Maker: Luis Fdo Castellanos .");
        System.out.println("...............................");
    }

    public static void f_saved_money(int p_salary){
        //description: this method/function calculates the total saved money in a year.
        double saved_money=((p_salary*0.15)*4)*12;
        System.out.println("The total saved money in a year is: "+saved_money);
    }

}
