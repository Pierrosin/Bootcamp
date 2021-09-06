public class Point{
    private int x;
    private int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return("x="+this.x+" y="+this.y);
    }

    public double norme(){
        double n=Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
        return n;
    }

    public Point additionner(Point p){
        Point p2=new Point(p.x+this.x,p.y+this.y);
        return p2;
    }
}