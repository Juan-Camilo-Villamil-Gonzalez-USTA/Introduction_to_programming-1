package usta.sistemas;

import java.util.Scanner;

public class Main {
    // AUTHOR: lUIS FERNANDO CASTELLANOS
    // DATE:  2020-MAY-05
    // DESCRIPTION:this program Store in a matrix the number of students (10) with which a subject has, with their
    // respective four notes (P1: 20%, P2:25%, P3:25%, P4:30%.... Notes are random values between 0.0 and 5.0)
    public static void main(String[] args) {
       f_menu();
       double[][] matrix_grades=f_fill_matrix();
       f_show_final_grades(matrix_grades);
    }
    public static void f_menu() {
        //DESCRIPTION: This method return the total numbers
        System.out.println("╔════════════════════════════╗");
        System.out.println("║      SoftGradeStudents     ║");
        System.out.println("║ Maker:LuisFdo Castellanosg ║");
        System.out.println("║ Date: 2020-may-12          ║");
        System.out.println("╚════════════════════════════╝");
    }
    public static double[][] f_fill_matrix(){
        //DESCRIPTION: this method returns the fill matrix (10x4)
        double[][] matrix = new double[10][4];
        for (int i=0; i<10;i++){
            matrix[i][0]= Math.floor((Math.random()*5)+1); //first grade random 0.0 y 5.0
            matrix[i][1]= Math.floor((Math.random()*5)+1); //second grade random 0.0 y 5.0
            matrix[i][2]= Math.floor((Math.random()*5)+1); //third grade random 0.0 y 5.0
            matrix[i][3]= Math.floor((Math.random()*5)+1); //fourth grade random 0.0 y 5.0
        }
        return  matrix;
    }
    public static void f_show_final_grades(double[][] matrix_grades){
     //description:  this methods show de final grades
        double final_grade=0;
     for (int i=0; i<10;i++){
         final_grade=matrix_grades[i][0]*0.2+
                 matrix_grades[i][1]*0.25+
                 matrix_grades[i][2]*0.25+
                 matrix_grades[i][3]*0.3;
         System.out.println("student ("+(i+1)+"), grade 1:"+matrix_grades[i][0]+" ,grade 2: "+matrix_grades[i][1]+
                            " ,grade 3: "+matrix_grades[i][2]+" ,grade 4: "+matrix_grades[i][3]+
                            " -> final grade: "+final_grade);
     }
    }
}
