public class Magicien extends Sorcier implements SuperPouvoir{
    public Magicien(String nom, int pdv){
        super(nom,pdv);
    }
    public double getPouvoir(){
        return (double)(extra)*super.getPouvoir();
    }
    public double sort(){
        return this.getPouvoir()*Math.random();
    }
    public int subitCharme(int coup){
        return (int)((double)(coup)*this.sort());
    }
}