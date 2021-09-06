public class Bootcamp {
	public static void main (String[] args){
		System.out.println("Hello World!");
		Point p=new Point(1,2);
		Point p2=new Point(2,1);
		System.out.println("p:"+p);
		System.out.println("p2:"+p2);
		System.out.println("norme(p)="+p.norme());
		System.out.println("p+p2:"+p.additionner(p2));
	}
}