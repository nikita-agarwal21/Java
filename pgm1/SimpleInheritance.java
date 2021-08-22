package pgm1;

public class SimpleInheritance {
	public static void main(String args[])
	{
		D superOb=new D();
		E subOb=new E();
		superOb.i=10;
		superOb.j=20;
		superOb.show();
		subOb.i=5;
		subOb.j=6;
		subOb.k=7;
		subOb.showk();
		subOb.sum();
		
		
	}

}
