
public class Camion extends Vehicule {
    public Camion(String marque, String modele, int cylindree, double essence,
                  double huile, double pression, int tours) {
        super(marque, modele, cylindree, essence, huile, pression, tours);
    }

    public void chargerCargo() {
        System.out.println(modele + " charge le cargo.");
    }
}
