package Poo.Herencia.Zombie;

public class Nemesis extends Zombie{
    private String apellido;

    public Nemesis(String apellido, double altura, String color) {
        super(color, altura);
        this.apellido=apellido;
    }

    public void controlarZombies(){
        System.out.println("Ya eres miooo..");
    }

    public void latigoTentaculo(){
        System.out.println("juapaa");
    }

}
