import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Voiture voiture = new Voiture("Toyota", "Corolla", 1800, 40.0, 5.0, 2.2, 0);
        int choice;
        int roadLength = 50;

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Test Voiture =====");

        do {
            System.out.println("\nclick 1 to open the door \nclick 2 to accelerate\nclick 0 to quit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    voiture.ouvrirPorte();
                    break;

                case 2:
                    for (int position = 0; position < roadLength; position++) {
                        // Clear screen (may not work in all IDEs)
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        // Print road
                        System.out.println("|---------------------------------------------------|");
                        System.out.println("|---------------------------------------------------|");
                        System.out.println("|---------------------------------------------------|");
                        System.out.println("|---------------------------------------------------|");
                        System.out.println("|---------------------------------------------------|");
                        System.out.print("|");

                        for (int i = 0; i < roadLength; i++) {
                            if (i == position) {
                                System.out.print("🚗");
                            } else {
                                System.out.print("-");
                            }
                        }
                        System.out.println("|");

                        Thread.sleep(150); // speed of the car
                    }
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}
