import input.*;
import Logic.*;
import java.util.*;
public class Excute {
	public static void main(String arg[])
	{
	Read in=new Read();
	switch(in.ch)
	{
	case '+':new Add(in.a,in.b);
			break;
	case '-':new Subtract(in.a,in.b);
			break;
	case '*':new Multiply(in.a,in.b);
			break;
	case '/':new Div(in.a,in.b);
			break;
	default :System.out.println("Please enter valid operator");
			break;
	}
	}

}
