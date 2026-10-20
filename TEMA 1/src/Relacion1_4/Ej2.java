package Relacion1_4;

import java.util.Scanner;

public class Ej2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero y te dire si es capicuo o no");
        int n1 = teclado.nextInt();
        int invertido = 0;
        int ultimoDigito;
        while (n1>0){
            ultimoDigito = n1 %10;
            invertido = invertido * 10 + ultimoDigito;
            n1 = n1 /10;
        }
        if (n1 == invertido){
            System.out.println("El numero es capicuo");
        }else {
            System.out.println("El numero no es capicuo");
        }
    }
}
