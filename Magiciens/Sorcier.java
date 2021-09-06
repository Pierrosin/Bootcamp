public class Sorcier extends Personnage{
    private double pouvoir;
    public Sorcier(String nom, int pdv){
        super(nom,pdv);
        this.pouvoir=Math.random();
    }
    public double getPouvoir(){
        return this.pouvoir;
    }
    public void attaque(Victime p){
        if (!this.mort()){
            int coup=p.subitCharme((int)((double)(this.getVie())*this.pouvoir));
            this.addVie(-coup);
        }
    }
    public int subitFrappe(int coup){
        this.addVie(-coup);
        return (int)((double)(this.getVie())*this.pouvoir);
    }
    public int subitCharme(int coup){
        return 0;
    }
}