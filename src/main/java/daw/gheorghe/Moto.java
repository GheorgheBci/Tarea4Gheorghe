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
}
