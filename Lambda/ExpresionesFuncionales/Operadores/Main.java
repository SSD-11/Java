package Lambda.ExpresionesFuncionales.Operadores;

public class Main {
    public static void main(String[] args) {
        NumTest t = (a, b) -> (a + b);
        System.out.println("Suma: " + t.test(10, 12));

        NumTest t2 = (a,b) -> (a - b);
        System.out.println("Resta: " + t2.test(10, 12));

        NumTest t3 = (a,b) -> (a * b);
        System.out.println("Multiplicacion: " + t3.test(10, 12));

        NumTest t4 = (a,b) -> ( b != 0? a/b : 0);
        System.out.println("Division: " + t4.test(10, 12));

    }
}
