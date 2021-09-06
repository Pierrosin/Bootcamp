public abstract class Personnage extends Victime{
    public Personnage(String nom, int pdv){
        super(nom,pdv);
    }
    public abstract void attaque(Victime p);
}