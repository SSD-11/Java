package OOP.Herencia.Zombie;

public class Main {

    public static void main(String[] args) {
        Nemesis nemesio = new Nemesis("nemesio", 2.20, "Azul");
        nemesio.superFuerza();
        nemesio.noSentirDolor();
        nemesio.controlarZombies();
        nemesio.latigoTentaculo();
        //nemesio.comerCerebros();

        Zombie chasqueador = new Zombie("amarillo",1.80);
        chasqueador.noSentirDolor();
        chasqueador.superFuerza();
        //chasqueador.controlarZombies();
        //chasqueador.latigoTentaculo();
        //chasqueador.comercerebros();

    }
}
