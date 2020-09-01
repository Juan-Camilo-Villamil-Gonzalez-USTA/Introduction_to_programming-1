package usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
      //AUTHOR: harrrison y luis fernando castellanos
      //DATE  :2020-06-03
      //DESCRIPTION: save names into file
    public static void main(String[] args) {
        int option= f_menu_option();
        do {
            if(option==1){
                f_add_names();
            }else if(option==2){
                f_DeleteNames();
            }else if(option==3) {
                f_ShowNames();
            }
            option=f_menu_option();
        }while (option!=0);
    }

    public static byte f_menu_option() {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("           ╔════════════════════╗");
            System.out.println("           ║      Savesoft      ║");
            System.out.println("           ║ By: Harrizon Soler ║");
            System.out.println("           ║ date:2020-06-03    ║");
            System.out.println("           ╚════════════════════╝\n");

            System.out.println("Select an option:" +
                    "\n1.Enter new Names" +
                    "\n2.Delete old names" +
                    "\n3.Visualize the archive" +
                    "\n0.Exit");

            byte option = keyboard.nextByte();

            while (option < 0 || option > 3) {
                System.err.println("ERROR, The input must be between 1 and 3, Retry:");
                option = keyboard.nextByte();
            }

            return option;
        } catch (Exception e) {
            System.err.println("ERROR, The method f_menu has an error because:");
            e.printStackTrace();
            return 0;
        }
    }

    public static void f_ShowNames() {
        try {
            Scanner myFile = new Scanner(new File("d:/names.txt"));

            System.out.println("The data of the archive Names.txt is:");

            while (myFile.hasNextLine()) {
                System.out.println(myFile.nextLine());
            }
        } catch (Exception e) {
            System.err.println("ERROR, The method f_ShowNames has an error because:");
            e.printStackTrace();
        }
    }

    public static void f_DeleteNames() {
        try {
            PrintWriter myFile = new PrintWriter("d:/names.txt", "UTF-8");

            myFile.println("");
            myFile.close();

            System.out.println("The data has deleted susessfully.");
        } catch (Exception e) {
            System.err.println("ERROR, The method f_DeleteNames has an error because:");
            e.printStackTrace();
        }
    }

    public static void f_add_names(){
        try {
            File file= new File("d:/names.txt");
            if (file.exists()) {
                //instanciamos el archivo con TRUE para agregar nuevas lineas
                FileWriter myFile = new FileWriter(file, true);
                //lo cargamos en memoria RAM
                BufferedWriter datafile= new BufferedWriter(myFile);
                //agregamos la linea
                datafile.write("\n"+f_input_name());
                System.out.println("----the new name is save---");
                //cerrramos el archivo
                datafile.close();
            }else{
                System.out.println("SORRY the file D:/names.txt DON'T EXIST");
             }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String f_input_name(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input de new name:");
        String name=keyboard.nextLine();
        while(name.length()<5){
            System.err.println("ERR: the size of the name should than five or greater");
            System.out.println("Input again the name");
            name=keyboard.nextLine();
        }
        return name;
    }
}
