package OOP.Herencia.Zombie;

public class Zombie {
    private String color;
    private  double altura;

    public Zombie(String color, double altura) {
        this.color = color;
        this.altura = altura;
    }

    public void superFuerza(){
        System.out.println("BLAA!!,BLA!..BlAAA!!..");
    }
    void noSentirDolor(){
        System.out.println("Hahaha.. Ni cosquillas..");
    }
    private void comerCerebros(){
        System.out.println("Rico..Rico..");
    }
}
