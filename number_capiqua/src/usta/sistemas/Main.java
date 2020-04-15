package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Numero, aux, inverso = 0, residuo;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un número mayor que 10: ");
            Numero = sc.nextInt();
        } while (Numero < 10);

        //le damos la vuelta al número
        aux = Numero;
        while (aux != 0) {
            residuo = aux % 10;
            inverso = inverso * 10 + residuo;
            aux = aux / 10;
            System.out.println("Residuo: "+residuo+", inverso:"+inverso+" Restante: "+aux);
        }

        if (Numero == inverso) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}
