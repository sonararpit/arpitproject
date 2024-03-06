package javapratices;

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c = new Child1();
		c.add();
	}

}

class parent {
	int a =10;
	public parent(){
		System.out.println("Parent class constructor");
	}
	public void testing(){
		System.out.println("Parent class method");
	}
}
class Child1 extends parent{
	public Child1(){
		super();
		System.out.println("Child class constructor");
	}
	int a = 20;
	public void add(){
		super.testing();
		System.out.println(super.a + this.a);
	}
}