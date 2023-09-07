package Arrays;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Se pide la longitud
        System.out.println("Inserte una longitud: ");
        int longitud = sc.nextInt();

        //Creo un array con esa longitud
        int[] numeros = new int[longitud];

        int num;

        //Se recorre el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Inserte un numero para la posicion " + i);

            do {

                //Se pide el numero para la pisicion especifica
                num = sc.nextInt();

                if (!(num >= 0 && num <= 10)) {
                    System.out.println("Error. Solo numeros desde el 0 al 10" +
                            "Inserte un numero para la posicion " + i);
                }
            } while (!(num >= 0 && num <= 10));

            //Se asigna el valor, ya que el numero pasa los parametros
            numeros[i] = num;

        }
        //Se imprimen los datos ingresados por el usuario
        System.out.println("Estos son los numeros elegidos por el usuario: ");
        for (int i : numeros) {
            System.out.print(i + "|");
        }

    }
}

