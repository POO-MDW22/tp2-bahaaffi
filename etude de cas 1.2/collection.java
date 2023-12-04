public class collection {
    public static void main(String[] args){

        Ustensile[] us=new  Ustensile[5];
        us[0]=new AssietteRonde(2000,12);
        us[1]=new AssietteRonde(1970,7);
        us[2]=new AssietteCarree(1960,13);
        us[3]=new cuillere(1990,6);
        us[4]=new cuillere(1914,8);


        affichercui(us);
        affichersurfaceassiette(us);
        afficherValtotal(us);
    }




    public static void affichercui(Ustensile[] us){
        int nombrcui=0;
        for(int i=0;i< us.length;i++){
            if(us[i] instanceof cuillere){
                nombrcui++;}
        }

        System.out.println ("il y a " +nombrcui+"cuilleres");

    }

    public static void affichersurfaceassiette(Ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Assiette) {
                somme = somme + ((Assiette) us[i]).calculsurface();
            }
        }

        System.out.println("surface totale des assietees :" +somme);
    }


    public static void afficherValtotal (Ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
            somme = somme + us[i].calculevaleur();
        }
        System.out.println("valeur totale de la collection :" + somme);

    }


}


