package Poo.Herencia.Vampiro;

public class Main {

    public static void main(String[] args) {
        Dracula vladimir = new Dracula("Vladimir", 666, "Black");
        vladimir.hipnotizar();
        vladimir.morder();
        vladimir.chuparSangre();
        //vladimir.aguantarSol();

        Vampiro edward = new Vampiro("Eduardo", 83);
        edward.morder();
        edward.chuparSangre();
        //edward.hipnotizar();
        //edward.aguantarSol();

    }
}
