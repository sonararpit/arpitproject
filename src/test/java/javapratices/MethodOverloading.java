package javapratices;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
		m.addition();
		m.addition(10,20);
	}
	public void additon(int num1,int num2)
	{
		System.out.println(num1 +num2);
	}
	public void addition()
	{
		System.out.println(1+2);
	}
	public float addition(int num1,float num2)
	{
		System.out.println(num1+num2);
		return num1+num2;
	}
}
class MethodoverloadExmple extends MethodOverloading
{
	public void addition (int num1, int num2,float num3)
	{
		System.out.println(num1+num2+num3);
	}
}