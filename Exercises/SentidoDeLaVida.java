package Exercises;/*Su programa es utilizar el enfoque de fuerza bruta para encontrar la respuesta a la vida, el universo y
todo. Más precisamente... reescribir números pequeños de entrada a salida. Deje de procesar la entrada después de leer
   el número 42. Todos los números en la entrada son enteros de uno o dos dígitos.
 */

import java.util.Scanner;

public class SentidoDeLaVida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        int valor = 0;

        do {
            valor = sc.nextInt();
            cadena += valor + ",";

        } while (valor != 42);

        String[] arreglo = cadena.split(",");

        for (int i = 0; i < arreglo.length - 1; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
