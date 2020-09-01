package usta.sistemas;

import javax.sound.midi.SysexMessage;
import java.io.File;
import java.util.Scanner;

public class Main {
    //AUTHOR: Luis fdo Castellanos
    //DATE:  2020-06-01
    //DESCRIPTION: this program show the information of a file.
    public static void main(String[] args) {
	// write your code here
        try {

            Scanner Myfile = new Scanner( new File("d:/prueba_2020601.txt"));
            while (Myfile.hasNextLine()){
                System.out.println(Myfile.nextLine());
            }
            Myfile.close();

        } catch (Exception e) {
            System.err.println("-----The software has finished with err:------");
            e.printStackTrace();
        }
    }
}
