package javapratices;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we cannot crete object of abstract class
		// new Abs();()
		Impl i = new Impl(10);
		i.add(10,10);
		i.sub(10,10);
	}

}
abstract class Abs {
	public abstract void add(int num1,int num2);
	public void sub (int num1, int num2)
	{
		System.out.println(num1-num2);
	}
	public Abs (int a)
	{

	}
}
class Impl extends Abs {
	public Impl (int a)
	{
		super(a);
	}
	public void add (int num1, int num2){
		System.out.println(num1+num2);
	}
}