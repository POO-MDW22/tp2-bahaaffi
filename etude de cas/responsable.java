class responsable extends employee{
    int prime;
    public responsable(String nom,int id,String adrs,int nb_h,int prime){
        super(nom,id,adrs,nb_h);
        this.prime=prime;
    }
    public float calculersalaire(){
        return nb_h>160 ? ((160*10) + (nb_h -160*10*0.2f)):(160*10);
    }
}
