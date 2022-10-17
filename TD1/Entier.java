package TD1;


public class Entier implements Sommable<Entier>{
    private int val;

    public Entier(int a)
    {
        this.val=a;
    }
    
    @Override
    public Entier Sommer(Entier t) {
        Entier somme=new Entier(t.val);
        return somme;
    }
}
