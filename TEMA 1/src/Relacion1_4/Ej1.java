package Relacion1_4;

import java.util.Scanner;

public class Ej1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = 0;
        int ultimodigito = 0;
        int invertido = 0;
        System.out.println("Dime un numero");
        n1 = teclado.nextInt();
        while (n1 > 0){
            ultimodigito = n1 %10;
            invertido = invertido * 10 + ultimodigito;
            n1 = n1 /10;
        }
        System.out.println("Su numero invertido es " + invertido);
    }
}
