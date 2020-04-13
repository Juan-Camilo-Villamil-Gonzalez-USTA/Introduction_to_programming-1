package usta.sistemas;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Luis Fernando castellanos G
	  Date: 2020 - april - 13
	  Description: program that uses different methods to Convert from ºC to ºF  | ºF to ºC | K to ºC | ºC to K
	 */
       int kind_from, kind_to;
	    f_menu();
        kind_from=f_kind_from_grades();
        if (kind_from!=0){  //if user input 1 or 2 or 3
            kind_to=f_kind_to_grades(kind_from);
            if (kind_to!=0){
                f_convert(kind_from,kind_to);
            }
        }

    }
    public static void f_menu(){
       //Description: this method show the menu of this software
        System.out.println("-----------------------");
        System.out.println("|        SoftConvert  |");
        System.out.println("|Version 1.0 20200413 |");
        System.out.println("|Created by: LFCG     |");
        System.out.println("-----------------------");
        System.out.println("Input of the kind of grades:\n1-celsius\n2-fahrenheit\n3-kelvin:");
    }
    public static int f_kind_from_grades(){
        //description: this method return from  kind of grades
        Scanner keyboard = new Scanner(System.in);
        int opt=keyboard.nextInt();
        if (opt==1 || opt ==2 || opt==3){
            System.out.println("started");
        }else{
            System.err.println("ERR: FINISH THE SOFTWARE, THE REASON IS THE CLASS DOES NOT EXIST");
            opt=0;
        }
        return opt;
    }
    public static int f_kind_to_grades(int kind_from){
        //description: this method return to kinds grades
        System.out.println("Input of the kind do you want convert the grades:\n 1-celsius\n 2-fahrenheit\n 3-kelvin:");
        Scanner keyboard = new Scanner(System.in);
        int opt=keyboard.nextInt();
        if (opt==1 || opt ==2 || opt==3){
            if (opt==kind_from){
                System.err.println("ERR: THE CLASS ARE SAME");
                opt=0;
            }
        }else{
            System.err.println("ERR: FINISH THE SOFTWARE, THE REASON IS THE CLASS DOES NOT EXIST");
            opt=0;
        }
        return opt;
    }
    public static void f_convert(int kind_from, int kind_to){
        //description: this method convert kinds grades
        System.out.println("Input the grades:");
        Scanner keyboard = new Scanner(System.in);
        int grades=keyboard.nextInt();
        double grades_convert;
        if (kind_from==1 && kind_to==2){ // convert celsius to fahrenheit ºF = ºC x 1.8 + 32.
            grades_convert=grades*1.8+32;
            System.out.println("The celsius:"+grades+" is same grades fahrenheit:"+grades_convert);
        }else if(kind_from==1 && kind_to==3){ // convert celsius to kelvin K = ºC + 273.15
            grades_convert=grades+273.15;
            System.out.println("The celsius:"+grades+" is same grades kelvin:"+grades_convert);
        }else if(kind_from==2 && kind_to==1) { // convert fahrenheit to celsius ºC = (ºF-32) ÷ 1.8
            grades_convert = (grades - 32) / 1.8;
            System.out.println("The fahrenheit:" + grades + " is same grades celsius:" + grades_convert);
        }else if(kind_from==2 && kind_to==3) { // convert fahrenheit to kelvin ºK = ((ºF-32) ÷ 1.8)+ 273.15
            grades_convert = ((grades - 32) / 1.8)+273.15;
            System.out.println("The fahrenheit:" + grades + " is same grades kelvin:" + grades_convert);
        }else if(kind_from==3 && kind_to==1) { // convert kelvin to celsius ºC = K - 273.15
            grades_convert = grades - 273.15;
            System.out.println("The kelvin:" + grades + " is same grades celsius:" + grades_convert);
        } else if(kind_from==3 && kind_to==2) { // convert kelvin to fahrenheit ºF = (K - 273.15)*1.8+32
            grades_convert = (grades - 273.15)*1.8+32;
            System.out.println("The kelvin:" + grades + " is same grades fahrenheit:" + grades_convert);
        }
    }
}
