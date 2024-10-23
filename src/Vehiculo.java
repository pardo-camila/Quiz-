
public abstract class Vehiculo {
    String marca;
    String modelo;
    String combustible;

    public Vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public abstract void encender();
    public abstract void apagar();
    public abstract void mostrarInformacion();

    public void abastecerCombustible() {
        System.out.println("Abasteciendo combustible...");
    }
}
