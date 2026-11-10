package Boletin_Arrays_1;

//Modifica el metodo anterior y acepta un parámetro “reverse”, que indique si el array
//debe devolverse ordenado de menor a mayor o al revés.


public class EJ9 {

        public static void main(String[] args) {

            int[] numeros = {5, 2, 8, 1, 3};

            numeros = ordenarBurbuja(numeros, false);

            for (int numero : numeros) {
                System.out.println(numero);
            }

        }

        public static int[] ordenarBurbuja(int[] numeros, boolean reverse) {

            for (int i = 0; i < numeros.length - 1; i++) {

                for (int j = 0; j < numeros.length - 1 - i; j++) {

                    if (reverse == false) {

                        if (numeros[j] > numeros[j + 1]) {
                            int temporal = numeros[j];
                            numeros[j] = numeros[j + 1];
                            numeros[j + 1] = temporal;
                        }

                    } else {

                        if (numeros[j] < numeros[j + 1]) {
                            int temporal = numeros[j];
                            numeros[j] = numeros[j + 1];
                            numeros[j + 1] = temporal;
                        }

                    }
                }
            }

            return numeros;
        }

}
