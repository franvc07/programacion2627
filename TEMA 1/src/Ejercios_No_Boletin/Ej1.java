package Ejercios_No_Boletin;

import java.util.Scanner;

public class Ej1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El número es impar");
        }

    }
}
