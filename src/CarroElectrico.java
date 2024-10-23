
public class CarroElectrico extends Carro implements VehiculoElectrico {
    private int nivelBateria;

    public CarroElectrico(String marca, String modelo, int nivelBateria) {
        super(marca, modelo, "Eléctrico");
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando batería...");
        nivelBateria = 100;
    }

    @Override
    public void mostrarNivelBateria() {
        System.out.println("Nivel de batería: " + nivelBateria + "%");
    }

    @Override
    public void encender() {
        System.out.println("El carro eléctrico está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El carro eléctrico está apagado.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Carro Eléctrico: " + marca + ", Modelo: " + modelo + ", Nivel de Batería: " + nivelBateria + "%");
    }
}
