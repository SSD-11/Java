package Spoj;/*Se desea llenar una matriz cuadrada de n x n, con los valores de 1 a n x n ordenandolos de forma de
espiral dentro de la matriz
 */

//CODIGO

import java.util.Scanner;

public class MatrizEnEspiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor maximo del espiral: ");
        int n = sc.nextInt();
        String[][] matriz = new String[n][n];
        int a = 0;
        int b = n - 1;
        int valor = 1;

        for (int j = 0; j < matriz.length; j++) {
            //Se Llena la fila superior
            for (int i = a; i <= b; i++) {
                matriz[a][i] = valor++ + "|";
            }
            //Se llena la columna del extremo derecho
            for (int i = a + 1; i <= b; i++) {
                matriz[i][b] = valor++ + "|";
            }
            //Se llena la fila inferior de derecha a izquierda
            for (int i = b - 1; i >= a; i--) {
                matriz[b][i] = valor++ + "|";
            }
            //Se llega la columna del extremo izquierdo de abajo hacia arriba
            for (int i = b - 1; i >= a + 1; i--) {
                matriz[i][a] = valor++ + "|";
            }
            a++;
            b--;
        }
        //Se muestra la matriz
        for (String[] strings : matriz) {//Se usa for mejorado para imprimir la matriz
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
