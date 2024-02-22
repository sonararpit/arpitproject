package javapratices;

class sujal
{
	int a=80 , b=90,c;
	//Without Return Type, Without Argument = addition
	void addition()
	{
		c=a+b;
		System.out.println("Addition Result=" +c);
	}

	//Without Return Type With Argument = subtraction
	void subtraction (int a,int b)
	{
		c=a-b;
		System.out.println("Subtraction Result =" +c);
	}

	//With Return Type, Without Argument = multiplication
	int multiplication()

	{
		c=a*b;
		return c;
	}

	//With Return type, With Argument = division

	int division (int a, int b)
	{
		c=a/b;
		return c;
	}
}	
public class rohit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sujal Cal = new sujal();
		Cal.addition();
		Cal.subtraction(80,90);
		System.out.println("Multiplication Result=" +Cal.multiplication());
		System.out.println("Division Result=" +Cal.division(80,90));
	}

}
