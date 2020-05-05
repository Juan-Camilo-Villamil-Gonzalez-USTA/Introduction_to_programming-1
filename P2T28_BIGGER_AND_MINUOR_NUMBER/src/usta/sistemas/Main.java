package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // AUTHOR: lUIS FERNANDO CASTELLANOS
        // DATE:  2020-MAY-05
        // DESCRIPTION:this program calculates what number is the bigger or minor
        int total_number= f_menu_total_numbers();  //save the total numbers
        int[] vector_numbers=f_fill_vector_numbers(total_number);
        f_show_bigger_number(vector_numbers);
        f_show_minor_number(vector_numbers);

    }
    public static int f_menu_total_numbers() {
        //DESCRIPTION: This method return the total numbers
        System.out.println("╔════════════════════════════╗");
        System.out.println("║  SoftBiggerMinorNumber     ║");
        System.out.println("║ Maker:LuisFdo Castellanosg ║");
        System.out.println("║ Date: 2020-may-05          ║");
        System.out.println("╚════════════════════════════╝");
        System.out.println("Input the total number:");
        Scanner keyboard = new Scanner(System.in);
        int total_number= keyboard.nextInt();
        while (total_number<=0){
            System.err.println("ERR: the value can't be minor or same zero");
            System.out.println("Input again the total number:");
            total_number= keyboard.nextInt();
        }
        return total_number;

    }
    public static int[] f_fill_vector_numbers(int total_numbers){
        //Description: this fill the vector
        Scanner keyboard= new Scanner(System.in);
        int[] vector=new int[total_numbers]; //defined how many values have the vector
        /// total_numbers -> vector.length
        for(int i=0;i<vector.length;i++){
            System.out.println("input the integer number ("+(i+1)+"):");
            vector[i]=keyboard.nextInt();
        }
        return vector;
    }

    public static void f_show_bigger_number(int[] vector_numbers){
        //description: show the bigger number in vector
        int bigger_number=0;
        for (int i=0; i< vector_numbers.length;i++){
            if (i==0){
                bigger_number=vector_numbers[i];
            }else{
                if(bigger_number<vector_numbers[i]){
                    bigger_number=vector_numbers[i];
                }
            }
        }
        System.out.println("The bigger number is: "+bigger_number);
    }
    public static void f_show_minor_number(int[] vector_numbers){
        //description: show the minor number in vector
        int minor_number=0;
        for (int i=0; i< vector_numbers.length;i++){
            if (i==0){
                minor_number=vector_numbers[i];
            }else{
                if(minor_number > vector_numbers[i]){
                    minor_number=vector_numbers[i];
                }
            }
            System.out.println("the vector["+i+"]"+vector_numbers[i]);
        }
        System.out.println("The minor number is: "+minor_number);
    }

}
