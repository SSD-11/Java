package Poo.Constructores;

public class Auto {
    static private String marca, modelo, color;
    static private int cfuerza; //Caballos de fuerza del motor

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        System.out.println("Se ha creado un objeto de la clase AutoMovil Marca: " + this.marca + " Modelo: " + this.modelo + " y es de color: " + this.color);
    }

    public Auto(int cfuerza) {
        this.cfuerza = cfuerza;
        System.out.println("Se ha creado un objeto de la clase AutoMovil con " + this.cfuerza + " caballos de fuerza");
    }

    //Metodos

    void arrancar(){
        System.out.println("-El vehiculo se Enciende..");
    }

    String acelerar(int km){
        km*=3;//km =km *3

        return ("-El Vehiculo va a "+ km +"km por hora..");
    }

    String girar(int dir){
        return (dir==1?"Derecha..":"Izquierda..");//Si la direccion es 1 se girara a la derecha, de lo contrario izquierda
    }

    void frenar(){
        System.out.println("-El vehiculo Frena..");
    }

    void reversar(){
        System.out.println("-El vehiculo Retrocede..");
    }








}
