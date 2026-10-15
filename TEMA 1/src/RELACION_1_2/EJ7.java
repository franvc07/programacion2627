package RELACION_1_2;

import java.util.Scanner;

public class EJ7 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        do {
            System.out.println("Dime un número");
            num1 = teclado.nextInt();
            if (num1 <= 0) ;
            {
                System.out.println("Dime un numero positivo");
            }
        } while (num1 <= 0);
        int suma = 0;

        for (int i = 0; i < num1; i++) {
            System.out.println("Introduce los numeros " + i);
            suma = suma + teclado.nextInt();
        }
        System.out.println("La media es " + (double) suma / num1);

    }
}