package Lambda.ExpresionesFuncionalesEnBloque;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        TestPrimos t = (a, b) -> {
            if (a == 1 || a == 0){
                a = 2;
            }

            ArrayList<Integer> primos = new ArrayList<>();
            for (int i = a; i <= b; i++) {
                boolean esPrimo = true;
                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo)
                    primos.add(i);
            }
            return primos;

        };
        System.out.println("Números Primos: " + t.test(1, 100));
    }
}

