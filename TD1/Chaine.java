package TD1;

public class Chaine implements Sommable<Chaine> {
    private String mot;

    public Chaine(String mot)
    {
        this.mot=mot;
    }
    @Override
    public Chaine Sommer(Chaine t) {
       Chaine mot=new Chaine(t.mot);
       return mot;
    }
    
}
