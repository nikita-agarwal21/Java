package pgm1;

import java.util.Scanner;

public class TriangleDemo {
public static void main(String args[])
{
	int a,b,c;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter three sides of a triangle:");
	a=scanner.nextInt();
	b=scanner.nextInt();
	c=scanner.nextInt();
	Triangle triangle=new Triangle(a,b,c);
	System.out.println("perimeter:"+triangle.findPerimeter());
	System.out.println("area:"+triangle.findArea());

}
}
