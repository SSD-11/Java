package Matrices;
//Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz.
//Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices originales y el resultado.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la matriz: ");
        int longitud = sc.nextInt();//Se ingresa la longitud

        int matriz1[][] = new int[longitud][longitud];
        int matriz2[][] = new int[longitud][longitud];//Se definen las matrices
        int resultado[][] = new int[longitud][longitud];

        for (int i = 0; i < matriz1.length; i++) {//Se recorren las matrices para darle sus valores
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.println("Escriba el valor para la fila " + i + " y la columna " + j + " de la matriz 1");
                matriz1[i][j] = sc.nextInt();

                System.out.println("Escriba el valor para la fila " + i + " y la columna " + j + " de la matriz 2");
                matriz2[i][j] = sc.nextInt();

                resultado[i][j] = matriz1[i][j] + matriz2[i][j];//Se le dan los valores de la suma a la matriz resultado
            }
        }
        //Se imprimen las matrices
        System.out.println("Matriz 1");
        imprimirMatriz(matriz1);
        System.out.println();

        System.out.println("Matriz 2");
        imprimirMatriz(matriz2);
        System.out.println();

        System.out.println("Matriz resultante");
        imprimirMatriz(resultado);


    }

    //Funcion para imprimir matrices
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print(matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }
}