package Regex;

public class Validate_Email {

    public static void main(String[] args) {

        String email = "Samuserna2005@gmail.com";
        String pattern = "^[a-zA-Z0-9_-]+\\w[.]?[a-z0-9]+[@]\\w+[.]\\w{2,3}\\w$";

        if (email.matches(pattern)) {
            System.out.println("El email es válido");
        } else {
            System.out.println("El email no es válido");
        }


    }
}
