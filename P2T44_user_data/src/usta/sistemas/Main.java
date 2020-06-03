package usta.sistemas;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    // AUTHOR: lUIS FERNANDO CASTELLANOS
    // DATE:  2020-MAY-05
    // DESCRIPTION: Create a txt file in C: \ named “user.txt" where the user personal data is stored, for each line:
    //Name:
    //Biography:
    //E-mail:
    //Phone:
    public static void main(String[] args) {
	// write your code here
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input your name:");
        String name = keyboard.nextLine();
        System.out.println("Input your biography:");
        String biography = keyboard.nextLine();
        System.out.println("Input your e-mail:");
        String email = keyboard.nextLine();
        System.out.println("Input your number phone");
        String phone = keyboard.nextLine();
        boolean ifsave=f_save_data(name,biography,email,phone);
        if (ifsave==true){
            System.out.println("Your information is save into d:/userdata.txt");
        }else{
            System.out.println("I'm sorry, Your information is NOT save into d:/userdata.txt");
        }

    }
    public static void f_menu() {
        //DESCRIPTION: This method show the initial menu
        System.out.println("╔════════════════════════════╗");
        System.out.println("║     SoftSaveDataUser       ║");
        System.out.println("║ Maker:LuisFdo Castellanosg ║");
        System.out.println("║ Date: 2020-jun-01          ║");
        System.out.println("╚════════════════════════════╝");
    }

    public static boolean f_save_data(String name,String biography,String email, String phone){
        //description: SAve de information into a file.
        boolean ifsave=true;
        try{
            PrintWriter   myFile = new PrintWriter("d:/userdata.txt","UTF-8");
            myFile.println("name: "+name);
            myFile.println("biography: "+biography);
            myFile.println("email: "+email);
            myFile.println("phone: "+phone);
            myFile.close();

        } catch (Exception e) {
            System.err.println("----THE SOFTWARE CANNOT SAVE THE INFORMATION:");
            e.printStackTrace();
            ifsave=false;
        }
        return  ifsave;
    }
}
