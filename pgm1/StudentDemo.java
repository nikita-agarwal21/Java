package pgm1;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String args[])
	{
		int n;String usn,name,branch,phonenumber;
		Student [] students=new Student[10];
				Student student =null;
		Scanner scanner =new Scanner(System.in);
		System.out.println("number of students");
		n=scanner.nextInt();
		for(int i=0;i<=n-1;i++)
		{
	System.out.println("enter usn,name,branch,phonenumber");
	usn=scanner.next();
	name=scanner.next();
	branch=scanner.next();
	phonenumber=scanner.next();
	student=new Student(usn,name,branch,phonenumber);
	students[i]=student;
		}
		System.out.printf("%-10s %-15s %-5s %-10s \n","usn","name","branch","phonenumber");
		System.out.println();
		for(int i=0;i<n;i++)
		System.out.printf("%-10s %-15s %-5s  %-10s \n",students[i].getUsn(),students[i].getName(),students[i].getBranch(),students[i].getPhonenumber());
		
	}

}
