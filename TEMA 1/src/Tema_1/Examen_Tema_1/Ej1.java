package Examen_Tema_1;

import java.util.Scanner;

public class Ej1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int vueltas;
        double objetivo;
        double tiempo;
        System.out.println("Dime el nombre del piloto");
        nombre = teclado.nextLine();
        System.out.println("Dime el numero de vueltas entre 3 y 10");
        vueltas = teclado.nextInt();

        for (int i = 0; i < vueltas; i++) {
            if (vueltas < 3) {
                System.out.println("Dime el numero de vueltas entre 3 y 10");
                vueltas = teclado.nextInt();
            } else if (vueltas > 10) {
                System.out.println("Dime el numero de vueltas entre 3 y 10");
                vueltas = teclado.nextInt();
            }
        }
        System.out.println("Tiempo objetivo: ");
        objetivo = teclado.nextInt();
        if (objetivo <= 0) {
            System.out.println("Introduce un numero mayor a 0 ");
            System.out.println("Tiempo objetivo: ");
            objetivo = teclado.nextInt();
        }
        for (vueltas = 3; vueltas < 10; vueltas++) {
            if (vueltas % 2 == 0) {
                System.out.printf("Vuelta %n");
            }

        }
    }
}
