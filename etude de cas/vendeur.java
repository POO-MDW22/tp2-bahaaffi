public  class vendeur extends employee {
    int tv;
    public vendeur(String nom,int id,String adrs,int nb_h,int tv){
        super(nom,id,adrs,nb_h);
        this.tv=tv;
    }

    public vendeur(int i, String sabrine, String sidibouzid, int nb_h) {
    }

    public float calculerSalaire() {
        return tv*450 ;
    }
}
