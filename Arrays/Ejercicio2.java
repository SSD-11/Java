package Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Se crea el Array
        int[] numeros = new int[100];

        //Declaro las variables necesarias
        int suma = 0;
        double media;

        //Recorro el array, se asignan los valores y se suman los numeros
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            suma += numeros[i];
        }

        //imprimo la suma, se calcula la media y se imprime
        System.out.println("La suma es: " + suma);

        media = (double) suma / numeros.length;
        System.out.println("La media es: " + media);
    }
}
