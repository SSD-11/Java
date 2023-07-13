package Poo.Practica.Orni;

public class Ornitorrinco extends Mamifero implements Anfibio, Oviparo, Venenoso {
    @Override
    public void amamantar() {
        System.out.println("Amamantando");
    }

    @Override
    public void respirarBajoElAgua() {
        System.out.println("Respirando bajo el agua");
    }

    @Override
    public void respirarPulmonar() {
        System.out.println("Respirando fuera del agua");
    }

    @Override
    public int ponerHuevos() {
        return (int) (Math.random() * 10);
    }

    @Override
    public void envenenar() {
        System.out.println("Envenenando");
    }
}
