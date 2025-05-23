
public class Voiture extends Vehicule {
    public Voiture(String marque, String modele, int cylindree, double essence,
                   double huile, double pression, int tours) {
        super(marque, modele, cylindree, essence, huile, pression, tours);
    }

    public void klaxonner() {
        System.out.println(modele + " klaxonne : Bip bip !");
    }
}
