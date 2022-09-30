package Lambda.ExpresionesFuncionales.NumeroMayor;

public class Main {
    public static void main(String[] args) {
        TestNum t = (a, b) -> (a > b);
        if (t.test(10, 12))
            System.out.println("10 es mayor que 12");
        else
            System.out.println("10 no es mayor que 12");

        TestNum t2 = (a,b) -> (a % b == 0);
        if (t2.test(10, 2))
            System.out.println("A es factor de B");
        else
            System.out.println("A no es factor de B");
    }
}