package Spoj;

public class TablasConSumas {


    public static void main(String[] args) {

        for (int tabla = 1; tabla <= 10; tabla++) {
            int resultado = 0;
            System.out.println("\nTabla del " + tabla + "\n");
            for (int numero = 1; numero <= 10; numero++) {
                resultado += tabla;
                System.out.println(tabla + " x " + numero + " = " + resultado);
            }
        }
    }
}