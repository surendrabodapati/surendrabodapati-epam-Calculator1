package Logic;
public class Div {

	public Div(int a, int b)
	{try {
		System.out.println("Division of "+a+" and "+b+" is : "+(a/b));
	}
	catch(Exception e)
	{
		System.out.println(e+"Denominator cannot be zero");
	}
	}
}
