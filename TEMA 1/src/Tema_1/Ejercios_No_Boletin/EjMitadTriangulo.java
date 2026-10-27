package Ejercios_No_Boletin;

import java.util.Scanner;

public class EjMitadTriangulo {
    static void main(String[] args) {
        System.out.println("Dime la altura");
        Scanner teclado = new Scanner(System.in);
        int altura;
        altura = teclado.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
