package OOP.Herencia.Vampiro;

public class Vampiro {
    private String nombre;
    private int edad;

    public Vampiro(String name, int age) {
        this.nombre = name;
        this.edad = age;
    }

    public void morder(){
        System.out.println("Lleve lo suyo pa'..");
    }

    void chuparSangre(){
        System.out.println("Chimba de sangre pai..");
    }
    private void aguantarSol(){
        System.out.println("Sol, solecito, no me calientas ni un poquito");
    }

}
