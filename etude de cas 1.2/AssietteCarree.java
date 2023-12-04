public class AssietteCarree extends Assiette{
    private double cote;
    public AssietteCarree (int anneefabrication,double cote) {
        super(anneefabrication);
        this.cote = cote;
    }

    public double getcote(){
        return cote;

    }

    public double calculsurface()
    {
        return (getcote() * getcote());
    }


}



