package usta.sistemas;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: luis fernando castellanos
       DATE: 2020-may-28
       DESCRIPTION : CREATE TEXT FILE
	 */
        try {    //perfect action

            PrintWriter  admin_files = new PrintWriter("Z:/Users/lufer/Documents/prueba.txt");
            admin_files.println("first line");
            admin_files.println("second line");
            admin_files.close();

        } catch (Exception e) {  //exist err
            System.err.println("ERR: the software is finish because:");
            e.printStackTrace();   //show the error (engineer)
        }

    }
}
