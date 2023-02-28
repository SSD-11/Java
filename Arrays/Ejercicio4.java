package Arrays;

import java.util.Scanner;

//Crea un array insertando números aleatorios entre 0 y 10. Muestralos por pantalla.
public class Ejercicio4 {
    public static void main(String[] args) {


        Scanner sn = new Scanner(System.in);

        //Se pide la longitud
        System.out.println("Inserte una longitud");
        int longitud = sn.nextInt();

        //Creo un array con esa longitud
        int[] numeros = new int[longitud];

        //Se recorre el array y se asignan los valores con la funcion para generar numeros aleatorios
        for (
                int i = 0;
                i < numeros.length; i++) {
            numeros[i] = generaNumeroAleatorio(0, 10);
            System.out.println("En la posicion " + i + " esta el valor: " + numeros[i]);
        }

    }

    //Función para generar números aleatorios con un rango específico
    public static int generaNumeroAleatorio(int minimo, int maximo) {

        return (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));

    }
}



