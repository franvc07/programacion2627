package RELACION_1_2;

import java.util.Scanner;

public class EJ4 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero positivo y te dare la suma de los primeros numeros hasta ese numero");
        int num1;
        int resutado = 0;
        num1 = teclado.nextInt();
        for (int i = 1; i <= num1; i++){
            resutado= resutado +i;
        }
        System.out.println("Su numero es " + num1);
        System.out.println("El resultado de las suma hasta ese numero es "+ resutado);
    }
}
