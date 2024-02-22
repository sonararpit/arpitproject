package javapratices;

public class Operatersinjava 
{
	int a=50;
	void prefixIncrement() {
		System.out.println("Prefix Increment value of a: " + ++a);
	}
	void postfixIncrement() {
		System.out.println("Postfix Increment value of a: " + a++);
		System.out.println("Updated value of a: " +a);
	}
	
	void arithmaticOperater() {
		int a = 40, b=20;
		System.out.println("Addition using + Operater: " + (a+b));
		System.out.println("Substraction using - Operater: " + (a-b));
		System.out.println("Multiplication using * Operater: " + (a*b));
		System.out.println("Division using / Operater: " + (a/b));
		System.out.println("Reminder using % Operater: " + (a%b));
	}
	void RelationalOperater() {
		int i =10;
		if (i<11) {
			System.out.println("Strictly less than");
		}
		if (i<=10) {
			System.out.println("less than or equal to");
		}
		if (i>9) {
			System.out.println("Strictly greater than");
		}
		if (i>=10) {
			System.out.println("Greater than or equal to");
		}
		if (i == 10) {
			System.out.println("Is equal to");
		}
		if (i != 11) {
			System.out.println("Is not equal to");
		}
	}
	void logicalOperater() {
		int a=10, b=20;
		if (a==10 && b==20) {
			System.out.println("Both conditions are True using && Operater");
		}
		if (a==10 || b==20) {
			System.out.println("Any one condition is true using || Operater");
		}
	}
	void ternaryOperater() {
		int a=10,b;
		b = a<20? 100:200;
		System.out.println("Value of b:" + b);
	}
	void assignmentOperater() {
	int a=10;
	a+=10; //a = a+10
	System.out.println("Result of +=: " +a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operatersinjava op = new Operatersinjava();
		//op.prefixIncrement();
				op.postfixIncrement();
				op.arithmaticOperater();
				op.RelationalOperater();
				op.logicalOperater();
				op.ternaryOperater();
				op.assignmentOperater();
	}

}
