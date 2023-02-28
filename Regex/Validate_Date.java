package Regex;

public class Validate_Date {

    public static void main(String[] args) {

        String date = "22/05/2005";
        String pattern = "(0?[1-9]|[12][0-9]|3[01])[- /.](0?[1-9]|1[012])[- /.](19|20)\\d\\d$";

        if (date.matches(pattern)) {
            System.out.println("La fecha es válida");
        } else {
            System.out.println("La fecha no es válida");
        }
    }
}
