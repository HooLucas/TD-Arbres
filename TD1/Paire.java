package TD1;

public class Paire<T,U> implements IPaire<T,U>
{
    private T fst;
    private U snd;
    public Paire(T a,U b)
    {
        this.fst=a;
        this.snd=b;
    }
    @Override
    public T fst(){return fst;}
    @Override
    public U snd(){return snd;}
    @Override
    public <V> IPaire<V, U> changerFst(V v) {
        return new Paire<>(v,snd);
    }
    @Override
    public <V> IPaire<T, V> changerSnd(V v) {
        return new Paire<>(fst,v);
    }

    public String toString()
    {
        return "("+ fst + "," + snd + ")" + "::  Paire[" + fst.getClass() + "," + snd.getClass() + "]" ;
    }
    

public static void main(String[] args)
{
    Paire test=new Paire(5,"oui");

    System.out.println(test.toString());
    test.changerFst(1.0);
    System.out.println(test.toString());

}
}
