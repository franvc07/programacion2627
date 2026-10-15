package RELACION_1_2;

import java.util.Scanner;

public class EJ8 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1;
        int respuesta;
        int S;
        int N;
        num1 = teclado.nextInt();
        for (int i = 0; i < num1; i++){
            System.out.println("¿Desea introducir más números (S/N)");
            respuesta = teclado.nextInt();
            if (respuesta == S){
                System.out.println("dime otro numero");
            }
        }
    }
}