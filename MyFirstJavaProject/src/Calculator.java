
public class Calculator {

	public static void main(String [] args)
	{
		System.out.println("Calculator\n");
		Calculator cal=new Calculator();
		System.out.println("The addition is: "+cal.addition(3, 6));
		System.out.println("The substraction is: "+cal.substraction(3, 6));
		System.out.println("The multiplication is: "+cal.multiplication(3, 6));
		System.out.println("The division is: "+cal.division(3, 6));
	}
	public int addition(int a, int b)
	{
		return a+b;
		
	}
	public int substraction(int a, int b)
	{
		return a-b;
	}
	public int multiplication(int a, int b)
	{
		return a*b;
	}
	public int division(int a, int b)
	{
		return a/b;
	}
}
