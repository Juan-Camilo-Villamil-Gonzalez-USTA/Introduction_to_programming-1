package usta.sistemas;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    // AUTHOR: lUIS FERNANDO CASTELLANOS
    // DATE:  2020-JUN-02
    // DESCRIPTION: ask the user to enter N amount of names of people and these names are saved in a file called
    // "names.txt", the names must be saved one on each line (Each name must have a minimum of 5 letters).
    public static int  total_names;
    public static String[] vector_names;

    public static void main(String[] args) {
	// write your code here
        f_menu();
        for (int i=0; i<total_names;i++){
            vector_names[i]=f_input_name(i);
        }
        f_save_file();

    }
    public static void f_menu() {
        //DESCRIPTION: This method show the initial menu
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("╔════════════════════════════╗");
            System.out.println("║      SoftSaveNames         ║");
            System.out.println("║ Maker:LuisFdo Castellanosg ║");
            System.out.println("║ Date: 2020-jun-02          ║");
            System.out.println("╚════════════════════════════╝");
            System.out.println("Input de total names:");
            total_names=keyboard.nextInt();
            while(total_names<1){
                System.out.println("Sorry the total names should be grater than zero, input again the total names: ");
                total_names=keyboard.nextInt();
            }
            vector_names=new String[total_names];

        } catch (Exception e) {
            System.err.println("ERR: the system is finish, because: ");
            e.printStackTrace();
        }
    }

    public static String f_input_name(int i){
        //description: this method returns the name
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Input the name for person ("+(i+1)+")");
            String name=keyboard.nextLine();
            while (name.length()<5){
                System.out.println("Sorry, the name should have five or more characters, Input  Again the name for person ("+(i+1)+")");
                name=keyboard.nextLine();
            }
            return name;
        } catch (Exception e) {
            System.err.println("Err: the software is finish because:");
            e.printStackTrace();
            return "";
        }
    }

    public static void f_save_file(){
        //description: this method walks the vector and save the data into a file
        try{
            PrintWriter myFile = new PrintWriter("d:/names.txt","UTF-8");

            for (String i_name: vector_names){
                myFile.println(i_name);
            }
            /*for(int i=0;i<vector_names.length;i++){
                myFile.println(vector_names[i]);
            }*/
            myFile.close();
            System.out.println("The data with name is save into d:/names.txt");

        } catch (Exception e) {
            System.err.println("The data DON'T save into d:/names.txt, because:");
            e.printStackTrace();
        }
    }
}
