
public class Bus extends Vehicule {
    public Bus(String marque, String modele, int cylindree, double essence,
               double huile, double pression, int tours) {
        super(marque, modele, cylindree, essence, huile, pression, tours);
    }

    public void ouvrirPortesPassagers() {
        System.out.println(modele + " ouvre les portes passagers.");
    }
}
