package Ejercios_No_Boletin;

import java.util.Scanner;

public class EjRectangulo {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;
        String n1 = " ";
        int anchura;
        System.out.println("Dime la altura");
        altura = teclado.nextInt();
        System.out.println("Dime la anchura");
        anchura = teclado.nextInt();

        for (int i = 0; i < anchura; i++) {
            n1 = n1 + "*  ";
        }
        for (int i = 0; i < altura; i++) {
            System.out.println(n1);
        }
    }
}