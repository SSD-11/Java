package OOP.Encapsulamiento;

public class Main {

    public static void main(String[] args) {
        AutoMovil obj = new AutoMovil("Ferrari", "2021");

        System.out.println(obj);
        obj.setModelo("2022");

        System.out.println("Se ha modificado el modelo a: "+obj.getModelo());

    }


}
