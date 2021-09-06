public class Monstre extends Personnage{
    public Monstre(String nom, int pdv){
        super(nom,pdv);
    }
    public void attaque(Personnage p){
        if (!this.mort()){
            int coup=p.subitFrappe(this.getVie()/2);
            this.addVie(-coup);
        }
    }
    public int subitFrappe(int coup){
        this.addVie(-coup);
        return this.getVie()/2;
    }
    public int subitCharme(int coup){
        this.addVie(-coup);
        return -this.getVie()/2;
    }
}