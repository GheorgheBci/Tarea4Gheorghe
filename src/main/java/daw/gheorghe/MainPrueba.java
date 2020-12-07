package daw.gheorghe;

/**
 *
 * @author Jorge
 */
public class MainPrueba {

    public static void main(String[] args) {

        Moto moto = new Moto("GSX-S125", "negro", "142.0 cv", "Suzuki");

        Moto moto2 = new Moto();

        System.out.println("Datos de la moto: " + moto.getMarca() + ", " + moto.getModelo() + ", " + moto.getMotor() + ", " + moto.getColor());
        
        System.out.println("Datosd de la moto2: " + moto2);
    }
}
