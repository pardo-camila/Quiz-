
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro("Toyota", "Corolla", "Gasolina");
        Camion camion = new Camion("Volvo", "FH", "Diesel");
        Moto moto = new Moto("Yamaha", "YZF-R3", "Gasolina");
        CarroElectrico carroElectrico = new CarroElectrico("Tesla", "Model S", 80);

        int opcion;

        do {
            System.out.println("Menú de Vehículos:");
            System.out.println("1. Mostrar información del Carro");
            System.out.println("2. Mostrar información del Camión");
            System.out.println("3. Mostrar información de la Moto");
            System.out.println("4. Mostrar información del Carro Eléctrico");
            System.out.println("5. Mostrar nivel de batería del Carro Eléctrico");
            System.out.println("6. Cargar batería del Carro Eléctrico");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    carro.mostrarInformacion();
                    break;
                case 2:
                    camion.mostrarInformacion();
                    break;
                case 3:
                    moto.mostrarInformacion();
                    break;
                case 4:
                    carroElectrico.mostrarInformacion();
                    break;
                case 5:
                    carroElectrico.mostrarNivelBateria();
                    break;
                case 6:
                    carroElectrico.cargarBateria();
                    break;
                case 7:
                    System.out.println("Saliendo del menú.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
            System.out.println();
        } while (opcion != 7);

        scanner.close();
    }
}
