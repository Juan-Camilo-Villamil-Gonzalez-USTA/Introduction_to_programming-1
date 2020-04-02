package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Luis Fernando Castellanos guarin
	* DATE: 2020 - march -19
	* DESCRIPTION: This software generated a bill of supermarket paradise
	*/
		System.out.println("Bill software of supermarket paradise, input de firts product:");
		Scanner keyboard= new Scanner(System.in);
		int prod1, prod2, prod3, prod4, total_bruto;
		double IVA, TOTAL;
		prod1= keyboard.nextInt();
		System.out.println("Input second product:");
		prod2= keyboard.nextInt();
		System.out.println("Input third product:");
		prod3= keyboard.nextInt();
		System.out.println("Input fourth product:");
		prod4= keyboard.nextInt();
		total_bruto=prod1+prod2+prod3+prod4;
		IVA= total_bruto*0.19;
		TOTAL=total_bruto+IVA;
		System.out.println("Your bill is:");
		System.out.println("Total bruto:$"+total_bruto);
		System.out.println("IVA:$"+IVA);
		System.out.println("Total factura:$"+TOTAL);

    }
}
