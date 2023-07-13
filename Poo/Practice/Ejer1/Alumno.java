package Poo.Practice.Ejer1;

public class Alumno {


    private String nombre;
    private int edad;
    private Asignatura[] asignaturas;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        asignaturas = new Asignatura[0];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public double promedio() {
        double promedio = 0;
        for (Asignatura asignatura : asignaturas) {
            promedio += asignatura.getNota();
        }
        return promedio / asignaturas.length;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        //Pero hacer que si son mas de 4 asignaturas no se puede agregar mas
        if (asignaturas.length < 4) {
            Asignatura[] asignaturasTemp = new Asignatura[asignaturas.length + 1];
            for (int i = 0; i < asignaturas.length; i++) {
                asignaturasTemp[i] = asignaturas[i];
            }
            asignaturasTemp[asignaturas.length] = asignatura;
            asignaturas = asignaturasTemp;
        } else {
            System.out.println("No se puede agregar mas de 4 asignaturas para " + nombre);
        }

    }

    public static void main(String[] args) {
        //Generar 3 instancias de alumno con 4 asignaturas cada uno
        Alumno alumno1 = new Alumno("Juan", 20);
        alumno1.agregarAsignatura(new Asignatura("Matematicas", 3.5));
        alumno1.agregarAsignatura(new Asignatura("Fisica", 5.0));
        alumno1.agregarAsignatura(new Asignatura("Quimica", 3.0));
        alumno1.agregarAsignatura(new Asignatura("Edu.fisica", 3.2));
        alumno1.agregarAsignatura(new Asignatura("Programming", 3.0));
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Edad: " + alumno1.getEdad());
        System.out.println("Promedio: " + alumno1.promedio());
        System.out.println("------------------------------------------");
        for (Asignatura asignatura : alumno1.asignaturas) {
            System.out.println("Asignatura: " + asignatura.getNombre());
            System.out.println("Nota: " + asignatura.getNota());
            System.out.println("Estado: " + asignatura.estado());
            System.out.println("------------------------------------------");
        }
        System.out.println("------------------------------------------");


        Alumno alumno2 = new Alumno("Pedro", 21);
        alumno2.agregarAsignatura(new Asignatura("Matematicas", 3.5));
        alumno2.agregarAsignatura(new Asignatura("Fisica", 5.0));
        alumno2.agregarAsignatura(new Asignatura("Quimica", 3.0));
        System.out.println("Nombre: " + alumno2.getNombre());
        System.out.println("Edad: " + alumno2.getEdad());
        System.out.println("Promedio: " + alumno2.promedio());
        System.out.println("------------------------------------------");
        for (Asignatura asignatura : alumno2.asignaturas) {
            System.out.println("Asignatura: " + asignatura.getNombre());
            System.out.println("Nota: " + asignatura.getNota());
            System.out.println("Estado: " + asignatura.estado());
            System.out.println("------------------------------------------");
        }
        System.out.println("------------------------------------------");


        Alumno alumno3 = new Alumno("Maria", 22);
        alumno3.agregarAsignatura(new Asignatura("Matematicas", 3.5));
        alumno3.agregarAsignatura(new Asignatura("Fisica", 5.0));
        alumno3.agregarAsignatura(new Asignatura("Quimica", 3.0));
        System.out.println("Nombre: " + alumno3.getNombre());
        System.out.println("Edad: " + alumno3.getEdad());
        System.out.println("Promedio: " + alumno3.promedio());
        System.out.println("------------------------------------------");
        for (Asignatura asignatura : alumno3.asignaturas) {
            System.out.println("Asignatura: " + asignatura.getNombre());
            System.out.println("Nota: " + asignatura.getNota());
            System.out.println("Estado: " + asignatura.estado());
            System.out.println("------------------------------------------");

        }
        System.out.println("------------------------------------------");


    }

}
