package javapratices;

public class Thekeyworldinjava {

		//instance member varibale
	int a = 80;
	
	//constructor
	public Thekeyworldinjava(){
		this(30);
		System.out.println("default constructor");
	}
	public Thekeyworldinjava(int a){
		this(10.3f);
		System.out.println(a);
	}
	
	public Thekeyworldinjava(float b){
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thekeyworldinjava t = new Thekeyworldinjava();
		t.test1();
	}
	public void test(){
		//local member variable
		int a = 20;
		System.out.println(a+ this.a);
	}
	public void test1(){
		this.test();
	}
}
