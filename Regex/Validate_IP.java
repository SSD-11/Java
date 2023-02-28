package Regex;

public class Validate_IP {

    public static void main(String[] args) {

        String ip = "201.221.176.43";
        String pattern = "(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})";

        if (ip.matches(pattern)) {
            System.out.println("La IP es válida");
        } else {
            System.out.println("La IP no es válida");
        }
    }
}
