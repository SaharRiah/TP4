package tp4;

public class Mainfilm {

    public static void main(String[] args) {
        Jcc J = new Jcc(20, 2021);
        Docum f1 = new Docum("Le dernier refuge", "Ousmsan", "Mali", 86, "La guerre civile", 30);
        Film f2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105, 45);

        J.ajoutFilm(f1);
        J.ajoutFilm(f2);

        if (J.getAnnee() == 2021) {
            J.listeFilmsJCC();
        }

        System.out.println("Le montant des ventes de billets pour le film 1 : " + f1.totalVenteBillets());
        System.out.println("Le montant des ventes de billets pour le film 2 : " + f2.totalVenteBillets());
    }
}
