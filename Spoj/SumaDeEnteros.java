package Spoj;/*Dados dos números naturales (ambos no mayores de 200), cada número en una línea separada, imprima la suma
 ellos.
*/
import java.util.Scanner;
public class SumaDeEnteros {

    public static void main(String[] args) {
        int a,b,suma;

        Scanner sc = new Scanner(System.in);
        //Entrada
        a = sc.nextInt();
        b = sc.nextInt();
        //Proceso
        suma = a+b;

        //Salida
        System.out.println(suma);

    }
}