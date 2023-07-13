package Poo.Practice.Ejer1;

public class Asignatura {
    private String nombre;
    private double nota;

    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public String estado() {
        return nota >= 3.5 ? "Aprobado" : "Reprobado";
    }

    public String getNombre() {
        return nombre;
    }
}
