package Regex;

public class Validate_Pwd {

    public static void main(String[] args) {

        String pwd = "Password1#";

        String pattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

        if (pwd.matches(pattern)) {
            System.out.println("La contraseña es segura");
        } else {
            System.out.println("La contraseña no es segura");
        }
    }
}
