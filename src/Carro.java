
public class Carro extends Vehiculo {
    public Carro(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void encender() {
        System.out.println("El carro está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El carro está apagado.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Carro: " + marca + ", Modelo: " + modelo + ", Combustible: " + combustible);
    }
}
