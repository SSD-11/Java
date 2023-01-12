package Lambda.ExpresionesFuncionales.BusquedaEnCadena;

public class Main {
    public static void main(String[] args) {

        CadenaTest t = (cad1, cad2) -> (cad1.indexOf(cad2) != -1);
        if (t.test("Hola", "la"))
            System.out.println("La cadena contiene la subcadena");
        else
            System.out.println("La cadena no contiene la subcadena");
    }
}