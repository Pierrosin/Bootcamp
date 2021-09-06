public abstract class Personnage{
    private String nom;
    private int pdv;
    public Personnage(String nom, int pdv){
        this.nom=nom;
        this.pdv=pdv;
    }
    public String toString(){
        if (this.mort()){
            return this.nom+" est mort.";
        }
        else{
            return "Je m'appelle "+this.nom+" et j'ai "+this.pdv+" points de vie.";
        }
    }
    public String getNom(){
        return nom;
    }
    public boolean mort(){
        return this.pdv<=0;
    }
    public int getVie(){
        return this.pdv;
    }
    public void addVie(int num){
        this.pdv+=num;
    }
    public abstract void attaque(Personnage p);
    public abstract int subitFrappe(int coup);
    public abstract int subitCharme(int coup);
}