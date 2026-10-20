package RELACION_1_2;

import java.util.Scanner;

public class EJ5 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int contador = 0;
        System.out.println("Dime un numero");
        num1 = teclado.nextInt();
       while (num1 >= 0) {
           if (num1>0){
               contador++;
           }
           System.out.println("Este numero no es correcto");
            num1 = teclado.nextInt();
        }
        System.out.println("Has introducido " + contador + " numeros positivos");
    }
}
