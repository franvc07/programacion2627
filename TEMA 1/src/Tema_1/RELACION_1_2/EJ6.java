package RELACION_1_2;

import java.util.Scanner;

public class EJ6 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int resultado=0;
        System.out.println("Escribe 1 nuemros enteros");
        num1 = teclado.nextInt();
        System.out.println("Escribe 1 nuemros enteros");
        num2 = teclado.nextInt();
        for (int i = 0; i<num2; i++){
            resultado  = resultado + num1;
        }
        System.out.println("El resultado es "+ resultado);
    }
}
