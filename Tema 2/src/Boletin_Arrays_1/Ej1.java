package Boletin_Arrays_1;

public class Ej1 {
    //Crea un programa que sume todas las posiciones pares de un array de enteros

    static void main(String[] args) {
        int[] miArray = {1, 2, 3, 4, 5, 6};
        int resultado = sumaPosicionespares(miArray);
        System.out.println("La suma es: " + resultado);


    }
    static int sumaPosicionespares(int[] miArray){
        int resultado =0;
        for (int i = 0; i < miArray.length; i++) {
            if (i % 2 == 0) {
                resultado = resultado + miArray[i];
            }
        }
        return resultado;
    }

}