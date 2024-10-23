
public class Moto extends Vehiculo {
    public Moto(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void encender() {
        System.out.println("La moto está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La moto está apagada.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Moto: " + marca + ", Modelo: " + modelo + ", Combustible: " + combustible);
    }
}
