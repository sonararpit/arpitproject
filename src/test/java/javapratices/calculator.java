package javapratices;

public class calculator 
{
	// addition menthod
		public int addition(int num1, int num2) {
			return num1 + num2;
		}
		
		//subtraction method
		public int subtraction(int num1, int num2) {
			return num1 - num2;
		}
		
		//division method
		public int division(int num1, int num2) {
			return num1 / num2;
		}
		//multiplication method
		public int multiplication(int num1, int num2) {
			return num1 * num2;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator cal = new calculator();
		
		//Calling the addition() method
		int resultAddition = cal.addition(5, 5);
		System.out.println("Addition Result: " + resultAddition);
		
		//Calling the subtraction() method
		int resultSubtraction = cal.subtraction(10, 5);
		System.out.println("Subtraction Result:" + resultSubtraction);
		
		//Calling the division method
		int resultDivision = cal.division(10, 5);
		System.out.println("Division Result:" + resultDivision);
		
		//Calling the multiplication method
				int resultMultiplication = cal.multiplication(10, 5);
				System.out.println("multiplication Result:" + resultMultiplication);
	}

}
