import java.util.ArrayList;
public class Main {
    public static boolean onlySorciers(ArrayList l){
            int n = l.size();
            for (int i=0; i<n; i++){
                if (l.get(i) instanceof Monstre){
                    return false;
                }
            }
            return true;
    }
	public static void main (String[] args){
        ArrayList<Personnage> persos=new ArrayList<Personnage>();
        ArrayList<String> noms=new ArrayList<String>();
        noms.add("a");
        noms.add("b");
        noms.add("c");
        noms.add("d");
        noms.add("e");
        noms.add("f");
        noms.add("g");
        noms.add("h");
        noms.add("i");
        noms.add("j");

        for (int i=0;i<10;i++){
            if (i<5){
                persos.add(new Monstre(noms.get(i),(int)(Math.random() * 100)+1));
            }
            else{
                persos.add(new Sorcier(noms.get(i),(int)(Math.random() * 100)+1));
            }
        }
        
        while (persos.size()>1 && !Main.onlySorciers(persos)){
            int a=(int)(Math.random() * persos.size());
            int b=(int)(Math.random() * persos.size());
            while (b==a){
                b=(int)(Math.random() * persos.size());
            }
            persos.get(a).attaque(persos.get(b));
            if (persos.get(a).mort()){
                persos.remove(a);
            }
            if (persos.get(b).mort()){
                persos.remove(b);
            }
        }
        for (int i=0;i<persos.size();i++){
            System.out.println(persos.get(i));
        }
	}
}