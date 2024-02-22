package javapratices;

public class Variables {
	// data member's
		int rollNo=20; //Instance variable's
		String name="Arpit"; //Instance variable's
		final int b=20; //Final variable's
		static int S = 100;
		//member function's
		void show() {
			int a = 10;
			System.out.println("Local variable a: " +a);
		}
		void display() {
			//a=100;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables M1 = new Variables();
		System.out.println("Instance variable rollNo: " + M1.rollNo);
		System.out.println("Instance variable name: " +M1.name);
		M1.show();
		System.out.println("Final variable b: " + M1.b);
		System.out.println("Static variable S using object:" + Variables.S);
		System.out.println("Static variable S using classname:" + Variables.S);

	}

}
