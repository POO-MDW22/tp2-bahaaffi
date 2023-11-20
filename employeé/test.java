import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        produit p1=new produit(1021,"Lait","Delice",800);
        produit p2=new produit(2510,"Yaourt","Vitalait",500);
        produit p3=new produit(3250,"Tomate","Sicam",1200);
        magasin MG1=new magasin(5000,"Bouzid",9);
        MG1.ajouter(p1);
        MG1.ajouter(p2);
        MG1.ajouter(p3);
        MG1.affmagasin();
        System.out.println("le nombre  du magasin est"+MG1.num);
        System.out.println(p1.comparer1(p2));
        System.out.println( p1.comparer2(p2,p3));
        magasin carrefour=new magasin(5001,"tunis",5);
        magasin monoprix=new magasin(5100, "sousse",3);
        vendeur v1=new vendeur(6,"iskander","sidibouzid",28);
        responsable r1=new responsable("bassma",2,"tunis",52,600);
        responsable r2=new responsable("rayen",24,"sidibouzid",12,400);
        caissier c1=new caissier("baha",7,"tunis",10,1);
    }
}
