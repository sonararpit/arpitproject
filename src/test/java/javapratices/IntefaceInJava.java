package javapratices;

public class IntefaceInJava {

	int a= 10;

	public static void main(String[] args) {
		MyClass c = new MyClass();
		c.test();
		System.out.println(c.add(10,10));
	}
}
interface MyInterface
{
	public static final int a = 10;
	int b = 30;

	public abstract void test();

	int add (int num1,int num2);

}
interface Myinterface2
{
	void testing();
	public abstract void test();
}
interface MyInterface3 extends MyInterface,Myinterface2
{}

class MyClass implements MyInterface, Myinterface2 {
	@Override
	public void test()
	{
		System.out.println("test method");
	}
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	public void testing()
	{

	}
}