package tp4;

public class Jcc {
    private Film[] cpt;
    private int annee;
    private static final int nbfmax = 30;
    private static int nbf = 0;

    // Constructeur
    public Jcc(int taille, int annee) {
        if (taille <= nbfmax) {
            cpt = new Film[taille];
        } else {
            cpt = new Film[nbfmax];
        }
        this.annee = annee;
    }

    // Getters et Setters
    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

 
    public void ajoutFilm(Film f) {
        if (nbf < cpt.length) {
            cpt[nbf] = f;
            nbf++;
        } else {
            System.out.println("La compétition est au complet");
        }
    }

    public void listeFilmsJCC() {
        for (int i = 0; i < nbf; i++) {
            System.out.println(cpt[i].toString() + "\n");
        }
    }


    public float totalVenteBilletsJcc() {
        float tariftot = 0;
        for (int i = 0; i < nbf; i++) {
            tariftot += cpt[i].totalVenteBillets();
        }
        return tariftot;
    }
}
