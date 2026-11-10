//Crea un metodo que acepte un array de enteros y devuelva el mismo array ordenado
//de menor a mayor. Utiliza para ello el metodo de ordenación de la burbuja.

import java.util.Scanner;

public class Ej12 {
    static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 3};

        numeros = ordenarBurbuja(numeros);

        for (int numero : numeros) {
            System.out.println(numero);
        }

    }
    }
    public static int[] ordenarBurbuja(int[] numeros) {

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length -1 -i; j++) {
               if (numeros[j]>numeros[j+1]){
                   int temporal = numeros[j];
                   numeros[j]= numeros[j+1];
                   numeros[j+1] = temporal;
               }
            }
        }
        return numeros;
    }

void main() {
}
