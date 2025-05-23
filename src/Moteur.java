
public class Moteur {
    private int vitesse; // en km/h
    private int rapport; // entre 0 (point mort) et 6

    public Moteur() {
        this.vitesse = 0;
        this.rapport = 0;
    }

    public void accelerer() {
        if (rapport == 0) {
            System.out.println("Impossible d'accélérer en point mort !");
            return;
        }
        vitesse += 10 * rapport;
        System.out.println("Vitesse actuelle : " + vitesse + " km/h (rapport : " + rapport + ")");
    }

    public void freiner() {
        if (vitesse > 0) {
            vitesse -= 10;
            if (vitesse < 0) vitesse = 0;
        }
        System.out.println("Vitesse actuelle après freinage : " + vitesse + " km/h");
    }

    public void passerRapportSuperieur() {
        if (rapport < 6) {
            rapport++;
            System.out.println("Rapport supérieur engagé : " + rapport);
        } else {
            System.out.println("Déjà au rapport maximal !");
        }
    }

    public void passerRapportInferieur() {
        if (rapport > 0) {
            rapport--;
            System.out.println("Rapport inférieur engagé : " + rapport);
        } else {
            System.out.println("Déjà au point mort !");
        }
    }
}
