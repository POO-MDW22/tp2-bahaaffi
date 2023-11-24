public class test {
    public static void main (String[] args) {
        produit p1 = new produit(1021, "Lait", "Delice", 800);
        produit p2 = new produit(2510, "Yaourt", "Vitalait", 500);
        produit p3 = new produit(3250, "Tomate", "Sicam", 1200);
        magasin MG1 = new magasin(5000, "Bouzid", 9);
        MG1.ajouter(p1);
        MG1.ajouter(p2);
        MG1.ajouter(p3);
        MG1.affmagasin();
        System.out.println("le nombre  du magasin est" + MG1.num);
        System.out.println(p1.comparer1(p2));
        System.out.println(p1.comparer2(p2, p3));
        magasin carrefour = new magasin(5001, "centre ville ", 5);
        magasin monoprix = new magasin(5100, "Menzah 6", 3);
        vendeur v1 = new vendeur(6, "iskander", "sidibouzid", 28);
        vendeur v2 = new vendeur(6, "iskander", "sidibouzid", 28);
        vendeur v3 = new vendeur(6, "iskander", "sidibouzid", 28);
        responsable r1 = new responsable("bassma", 2, "tunis", 52, 600);
        caissier c1 = new caissier("baha", 7, "tunis", 10, 1);
        caissier c2 = new caissier("rayen", 5, "tunis", 9, 3);

        carrefour.ajouter_employe(c1);
        carrefour.ajouter_employe(c2);
        carrefour.ajouter_employe(v1);
        carrefour.ajouter_employe(r1);

        monoprix.ajouter_employe(v1);
        monoprix.ajouter_employe ( v2 );
        monoprix.ajouter_employe ( v3 );
        monoprix.ajouter_employe ( r1 );
        monoprix.ajouter_employe ( c1 );
        monoprix.afficher_employee ( );

        carrefour.ajouter ( p1 );
        carrefour.ajouter ( p3 );
        monoprix.ajouter ( p2 );


        System.out.println ( c1.calculersalaire ( ) );
        System.out.println ( v1.calculerSalaire ( ) );
        System.out.println ( r1.calculersalaire ( ) );
    }


}