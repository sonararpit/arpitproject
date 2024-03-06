package javapratices;

public class Finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class FinalUse{
	//final keyword use along with variable
	final long adharNumber = 1234567888888L;
	int b = 20;

	final public void test(){
		b =30;
		//we cannot change final variable once created.
		//adharNumber = 20;
	}
	//final keyword use along with method
}

final class Child extends FinalUse{

	//user doesn't allow to override final method
	//public void test(){
	//
	//}
}

//final class cannot be extended
//class GrandChild extends Child{
//
//}