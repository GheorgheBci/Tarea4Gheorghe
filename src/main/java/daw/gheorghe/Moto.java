package daw.gheorghe;

/**
 *
 * @author Jorge
 */
public class Moto {

    private String modelo;
    private String color;
    private String motor;
    private String marca;

    public Moto(String modelo, String color, String motor, String marca) {
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.marca = marca;
    }

    public Moto() {

        this.modelo = "Ninja 1000SX 2020";
        this.color = "Rojo";
        this.motor = "142.0 cv";
        this.marca = "Kawasaki";

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Moto{" + "modelo=" + modelo + ", color=" + color + ", motor=" + motor + ", marca=" + marca + '}';
    }

}
