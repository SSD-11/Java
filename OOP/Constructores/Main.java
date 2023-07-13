package OOP.Constructores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Auto ferrari = new Auto("Ferrari", "296 GTB 2021", "Amarillo");
        new Auto(800);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los kilometros por hora: ");
        int km = sc.nextInt();


        //Metodos
        System.out.println();
        System.out.println("Los Metodos del Vehiculo son:");
        System.out.println();
        ferrari.arrancar();
        System.out.println(ferrari.acelerar(km));
        System.out.println("-El vehiculo esta girando a la:" + ferrari.girar(1));
        ferrari.frenar();
        ferrari.reversar();
    }


}