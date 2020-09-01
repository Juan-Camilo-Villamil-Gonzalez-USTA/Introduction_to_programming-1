package usta.sistemas;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR:Luis Fernando Castellanos
	      DATE: 2020- April -20
	      DESCRIPTION:A housewife needs to make the market of the month and only has $ 500,000 pesos.
	    */
	    f_menu();
	    Scanner keyboard= new Scanner (System.in);
	    int summatory=0, cost_product, total_product=0;
        do {
            total_product+=1;
            System.out.println("Input the cost the product ("+total_product+"):");
            cost_product = keyboard.nextInt();
            summatory+=cost_product;
            System.out.println("the temporary bill is:"+summatory);
        }while(summatory<=500000);
        summatory-=cost_product;    //es igual a summatory= summatory - cost_product;
        total_product-=1;
        System.out.println("total bill: "+summatory+ ", total product: "+total_product);
    }
    public static void f_menu(){
        //Description: this method show the menu of this software
        System.out.println("╔══════════════════════╗");
        System.out.println("║   SoftMakeMarket     ║");
        System.out.println("║Version 1.0 20200422  ║");
        System.out.println("║Created by: LFCG      ║");
        System.out.println("╚══════════════════════╝");

    }
}
