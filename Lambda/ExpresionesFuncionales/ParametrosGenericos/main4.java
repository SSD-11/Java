package Lambda.ExpresionesFuncionales.ParametrosGenericos;

public class main4 {
    public static void main(String[] args) {
        TestGeneric<Integer> t = (a,b) -> (a % b == 0);
        if (t.test(10, 2))
            System.out.println("A es factor de B");
        else
            System.out.println("A no es factor de B");

        TestGeneric<String> t2 = (a,b) -> a.indexOf(b) != -1;
        if (t2.test("Hola", "la"))
            System.out.println("La cadena contiene la subcadena");
        else
            System.out.println("La cadena no contiene la subcadena");
    }
}
