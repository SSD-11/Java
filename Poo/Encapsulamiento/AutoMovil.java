package Poo.Encapsulamiento;

public class AutoMovil {

    private String marca, modelo;
    public AutoMovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Soy un AutoMovil" +
                " mi marca es = " + marca + "" +
                " y mi modelo es = " + modelo + "" +
                "";
    }
}
