package Ejercios_No_Boletin;

import java.util.Scanner;

public class EjCuadrado {
    static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int altura;
      System.out.print("dime la altura");
        altura = teclado.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }

    }
}
