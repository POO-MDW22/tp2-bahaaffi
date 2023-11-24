import java.util.Scanner;
public  class employee {
    protected String nom;
    protected int id;
    protected String adrs;
    protected int nb_h;
    public employee(){}
    public employee(String nom,int id,String adrs,int nb_h){
        this.id=id;
        this.adrs=adrs;
        this.nb_h=nb_h;
        this.nom=nom;
    }
    void afficheE(){
        System.out.println(nom+" "+ id +" "+ adrs);}

    public  float calculerSalaire(){
        return 0;
    };



}
