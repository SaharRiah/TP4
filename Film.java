package tp4;
import java.util.Scanner;
public class Film {
    protected String titre;
    protected String rls;
    protected String pays;
    protected int duree;
    protected int nbrp;
    private static int cmp = 0;

    public Film() {
        this.titre = "";
        this.rls = "";
        this.pays = "";
        this.duree = 0;
        cmp++;
        this.nbrp = cmp;
    }

    public Film(String titre, String r, String pays, int d, int nbrp) {
        this.titre = titre;
        this.rls = r;
        this.pays = pays;
        this.duree = d;
        this.nbrp = nbrp;
    }

    public int getNbrp() {
        return nbrp;
    }

    public void setNbrp(int nb) {
        this.nbrp = nb;
    }


    public String toString() {
        return "Titre: " + titre + ", Réalisateur: " + rls + ", Pays: " + pays + ", Durée: " + duree + " minutes.";
    }
    Scanner sc = new Scanner(System.in);
    public float totalVenteBillets() {
        System.out.println("Donner moi le nombre des places des étudiants");
        int nbrE = sc.nextInt();
        float mnt = 0;

        if (nbrE == nbrp) {
            mnt += 2 * nbrE;
        } else if (nbrE < nbrp) {
            mnt = nbrE * 2 + (nbrp - nbrE) * 3;
        }

        return mnt;
    }


}
