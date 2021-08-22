package pgm1;

public class Square implements Runnable 
{
private int x;
public Square(int x)
{
	this.x=x;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("sqaure of" +x+"="+x*x);
	}
 
}
