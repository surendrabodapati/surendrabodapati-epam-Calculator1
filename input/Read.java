package input;

import java.util.Scanner;

public class Read {
	public int a,b;
	public char ch;
	public Read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextDouble();
		System.out.println("Enter second number");
		b=sc.nextDouble();
		System.out.println("Please Enter operator");
		ch=sc.next().charAt(0);
	}

}
