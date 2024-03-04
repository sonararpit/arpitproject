package javapratices;

public class BeanClass {

	public static void main(String[] args) 
	{
		Test1 t = new Test1();
		t.setB(20);
		System.out.println(t.getB());
		
		Test1 t1 = new Test1();
		t1.setB(5000);
		System.out.println(t1.getB());
	}
	}
class test {
	int a;
	public int getA()
	{
		return a;
	}
}
class Test1
{
	int b;
	public int getB()
	{
		return b;
	}
	public void setB(int b)
	{
		this.b = b;
	}
}