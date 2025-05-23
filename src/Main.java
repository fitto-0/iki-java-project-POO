
public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Toyota", "Corolla", 1800, 40.0, 5.0, 2.2, 0);
        Bus bus = new Bus("Mercedes", "Sprinter", 3000, 60.0, 7.0, 2.5, 0);
        Camion camion = new Camion("Volvo", "FH16", 6000, 80.0, 8.0, 2.8, 0);

        System.out.println("===== Test Voiture =====");
        voiture.passerRapportSuperieur();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.println(" ");

            }
            voiture.accelerer();
        }

        // System.out.println("\n===== Test Bus =====");
        // bus.ouvrirPortesPassagers();
        // bus.passerRapportSuperieur();
        // bus.accelerer();
        // bus.tournerVolant("gauche");
        // bus.freiner();
        //
        // System.out.println("\n===== Test Camion =====");
        // camion.chargerCargo();
        // camion.passerRapportSuperieur();
        // camion.passerRapportSuperieur();
        // camion.accelerer();
        // camion.freiner();
        //
        //
    }

}
