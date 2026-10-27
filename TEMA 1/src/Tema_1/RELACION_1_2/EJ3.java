package RELACION_1_2;

import java.util.Scanner;

public class EJ3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num1;
        num1 = teclado.nextInt();
        if (num1 <= 0){
            System.out.println("No se puede introduzca otro numero");
            num1 = teclado.nextInt();
        }
        if (num1 %2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}
