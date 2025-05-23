
public abstract class Vehicule {
    protected String marque;
    protected String modele;
    protected int cylindree;
    protected double quantiteEssence;
    protected double niveauHuile;
    protected double pressionPneus;
    protected int nombreTours;
    protected Moteur moteur;
    private double position = 0.0;

    public Vehicule(String marque, String modele, int cylindree, double essence,
                    double huile, double pression, int tours) {
        this.marque = marque;
        this.modele = modele;
        this.cylindree = cylindree;
        this.quantiteEssence = essence;
        this.niveauHuile = huile;
        this.pressionPneus = pression;
        this.nombreTours = tours;
        this.moteur = new Moteur();
    }

    public double getPosition() {
        return position;
    }
    public boolean accelerer() {
        moteur.accelerer();
        return false;
    }

    public void freiner() {
        moteur.freiner();
    }

    public void passerRapportSuperieur() {
        moteur.passerRapportSuperieur();
    }

    public void passerRapportInferieur() {
        moteur.passerRapportInferieur();
    }

    public void tournerVolant(String direction) {
        System.out.println(modele + " tourne le volant vers la " + direction + ".");
    }

    public void ouvrirPorte() {
        System.out.println(modele + " ouvre la porte.");
    }

    public void fermerPorte() {
        System.out.println(modele + " ferme la porte.");
    }
}
