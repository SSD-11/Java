package Poo.Constructores;

public class Main {

    public static void main(String[] args) {

        Auto ferrari = new Auto("Ferrari", "296 GTB 2021", "Amarillo");
        new Auto(800);


        //Metodos
        System.out.println();
        System.out.println("Los Metodos del Vehiculo son:");
        System.out.println();
        ferrari.arrancar();
        System.out.println(ferrari.acelerar(100));
        System.out.println("-El vehiculo esta girando a la:" +ferrari.girar(1));
        ferrari.frenar();
        ferrari.reversar();
    }


}