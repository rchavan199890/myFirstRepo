
public class Calculator {

	public static void main(String [] args)
	{
		System.out.println("Calculator\n");
		Calculator cal=new Calculator();
		System.out.println("The addition is: "+cal.addition(3, 6));
	}
	public int addition(int a, int b)
	{
		return a+b;
		
	}
}
