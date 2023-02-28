package Matrices;
//Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números
//aleatorios entre 0 y 10.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de columnas: ");
        int c = sc.nextInt();//Se ingresa la longitud de las columnas

        int[][] matriz = new int[5][c];//Se define la matriz

        //Se recorre la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (c = 0; c < matriz[0].length; c++) {
                matriz[i][c] = generaNumAleatorio(0, 9);
                System.out.print(matriz[i][c] + "|");//Se imprime la matriz
            }
            System.out.println();
        }
    }

    //Función para generar números aleatorios en un rango específico
    public static int generaNumAleatorio(int minimo, int maximo) {

        return (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
    }
}

