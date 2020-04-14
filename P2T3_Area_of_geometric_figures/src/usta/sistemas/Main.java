package usta.sistemas;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    /*AUTHOR: Luis Fernando Castellanos G
	      DATE:   2020-April-14
	      DESCRIPTION: this software calculates the area of a circle, square or triangle
	     */
	    f_menu();
	    Scanner teclado= new Scanner(System.in);
	    int opt= teclado.nextInt();
	    if (opt<1 || opt >3){
            System.err.println("ERR: this option does not exist");
        }else{
	        if (opt==1){
	            //llamar la funcion de area de circulo
                f_area_circle();
            }else if(opt==2){
                //llamar la funcion de area de cuadrado
                f_area_square();
            }else{
                //llamar la funcion de area de triangulo
                f_area_triangle();
            }
        }

    }
    //esta funcion no le ingresan parametros y no me retorna nada
    public static void f_menu(){
        //Description: this method show the menu of this software
        System.out.println("-----------------------");
        System.out.println("|  SoftAreaFigures    |");
        System.out.println("|Version 1.0 20200414 |");
        System.out.println("|Created by: LFCG     |");
        System.out.println("-----------------------");
        System.out.println("Input the option of the figure :\n1-circle\n2-square\n3-triangle");
    }
    public static void f_area_circle(){
        //Description:this method calculates the area of circle
        Scanner teclado= new Scanner(System.in);
        System.out.println("To calculate the area of circle is necessary the radius, input this value (cm):");
        double radius= teclado.nextDouble();
        double area= (radius*radius)*3.141517;
        System.out.println("The area of circle is: "+area+ " (cm)");
    }
    public static void f_area_square(){
        //Description:this method calculates the area of circle
        Scanner teclado= new Scanner(System.in);
        System.out.println("To calculate the area of square is necessary the side, input this value (cm):");
        double side= teclado.nextDouble();
        double area= (side*side);
        System.out.println("The area of square is: "+area+ " (cm)");
    }
    public static void f_area_triangle(){
        //Description:this method calculates the area of triangle
        Scanner teclado= new Scanner(System.in);
        double base, height, area;
        System.out.println("To calculate the area of triangle is necessary the base and height, input the value base (cm):");
        base= teclado.nextDouble();
        System.out.println("Input the height (cm):");
        height=teclado.nextDouble();
        area=(base*height)/2;
        System.out.println("The area of triangle is: "+area+" (cm)");
    }
}
