package Arrays;
//Crea un array que contenga los numeros del 1 al 100. Muestralos por pantalla.

public class Ejercicio1 {
    public static void main(String[] args) {

        //Se crea El Array
        int[] numeros = new int[100];

        //Se recorre y se le asignan los valores
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            //Se imprimen los datos
            System.out.println(numeros[i]);
        }
    }
}
