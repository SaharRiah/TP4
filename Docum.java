package tp4;

public class Docum extends Film {
    private String sujet;
    private static final float tarif = 2;

    public Docum(String titre, String rls, String pays, int duree, String sujet, int nbrp) {
        super(titre, rls, pays, duree, nbrp);
        this.sujet = sujet;
    }

    public String toString() {
        return "Le sujet: " + sujet + ", ayant un titre " + titre + ", réalisé par: " + rls + ", en " + pays + ", avec une durée de " + duree + " minutes.\n";
    }
    public float totalVenteBillets() {
        return nbrp * tarif;
    }
}
