package Regex;

public class Validate_Twitter {

    public static void main(String[] args) {
        System.out.println(validarUsuarioTwitter("@samlsd_"));
        System.out.println(validarUsuarioTwitter("@burigang"));
        System.out.println(validarUsuarioTwitter("@samlsd_@samlsd_@samlsd_@samlsd_"));
        System.out.println(validarUsuarioTwitter("@"));
    }


    public static String validarUsuarioTwitter(String usuario) {
        String patron = "^@([A-Za-z0-9_-]){1,30}$";

        if (usuario.matches(patron)) {
            return "El usuario es válido";
        } else {
            return "El usuario no es válido";
        }
    }

}
