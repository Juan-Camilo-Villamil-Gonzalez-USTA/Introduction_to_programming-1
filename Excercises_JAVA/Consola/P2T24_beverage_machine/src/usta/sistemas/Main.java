package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // AUTHOR: luis fernando castellanosg
        // DATE: 2020-april -30
        // DESCRIPTION: Software that simulates hot drinks vending machine

        int product= f_menu_products();

        int product_cost=f_data_product(product,1); //me retorna el costo del product
        int product_time=f_data_product(product,2); //me retorna el tiempo del producto

        int money_user= f_input_money();

        while(money_user<product_cost){
            System.err.println("do you need input $"+(product_cost-money_user)+" money");
            money_user+= f_input_money();
        }
        int surplus= money_user-product_cost;
        System.out.println("your surplus money is: $"+surplus+" the product time finish is: "+product_time+" seconds");
    }
    public static int f_menu_products() {
        //DESCRIPTION: This method contain the menu of the software
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║                        COFFEEMACHINE                         ║");
        System.out.println("║  PRODUCTS             ║       VALUE      ║     CREATION TIME ║");
        System.out.println("║ 1. Aromatic           ║       $1300      ║        30 seconds ║");
        System.out.println("║ 2. Black Coffee       ║       $1000      ║        30 seconds ║");
        System.out.println("║ 3. Coffee with milk   ║       $1900      ║        45 seconds ║");
        System.out.println("║ 4. Cappuccino         ║       $2500      ║        60 seconds ║");
        System.out.println("║ 5. Mocha              ║       $2700      ║        70 seconds ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the option:");
        int option = keyboard.nextInt();
        while (option < 1 || option > 5) {
            System.err.println("ERR: OPTION NO EXITS");
            System.out.println("Input Again the option:");
            option = keyboard.nextInt();
        }
        return option;
    }
    public static int f_input_money() {
        //description: this method return the input money of user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input your money$:");
        int money = keyboard.nextInt();
        while (money < 50 || money > 5000) {
            System.err.println("ERR: your money cannot be processed (between $50 and $5000)");
            System.out.println("Input Again your money$:");
            money = keyboard.nextInt();
        }
        return money;
    }
    public static int f_data_product(int product,int option){
        //description: this methods return two choice (money or time)
        int data_product;
        if (product==1){  //aromatica
            if(option==1){  //money
                data_product=1300;
            }else{ //time
                data_product=30;
            }
        }else if(product==2){  //cafe negro
            if(option==1){  //money
                data_product=1000;
            }else{ //time
                data_product=30;
            }
        }else if(product==3){  //caffe con leche
            if(option==1){  //money
                data_product=1900;
            }else{ //time
                data_product=45;
            }
        }else if(product==4){ //capuchino
            if(option==1){  //money
                data_product=2500;
            }else{ //time
                data_product=60;
            }
        }else{ //mocachino
            if(option==1){  //money
                data_product=2700;
            }else{ //time
                data_product=70;
            }
        }
        return  data_product;
    }
}
