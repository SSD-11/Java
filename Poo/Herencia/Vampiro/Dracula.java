package Poo.Herencia.Vampiro;

public class Dracula extends Vampiro{

    private String apellido;

    public Dracula(String nombre, int edad, String apellido) {
        super(nombre, edad);
        this.apellido=apellido;
    }

    public void hipnotizar(){
        System.out.println("Tus ojos te pesan..ya eres mio..");
        
    }

}
