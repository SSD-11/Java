package Poo.Practice.Orni;

public class Main {
    public static void main(String[] args) {

        Ornitorrinco orni = new Ornitorrinco();

        System.out.println("El ornitorrinco pone " + orni.ponerHuevos() + " huevos.");
        orni.respirarBajoElAgua();
        orni.respirarPulmonar();
        orni.envenenar();
        orni.amamantar();
    }
}
