package javapratices;


class madhur
{
	int a=55,b=90;
	void ifstatement() {
		if (a==55 && b==90){
			System.out.println("Value of a is 55 & b is 90");
		}
	}
	void ifelseStatement() {
		int Bal = 20000;
		if (Bal<10000) {
			System.out.println("fine of Rs.500");
		}else {
			System.out.println("you're eligile for loan");
		}
	}
	
	void ifelseifStatement() {
		
		int Bal = 150000;
		if (Bal<10000) {
			System.out.println("Fine of Rs. 1000");
		}else if (Bal <100000) {
			System.out.println("Loan eligible Rs. 1 lakh");
		}else if (Bal<150000) {
			System.out.println("Loan eligible Rs. 2 lakh");
		}else if (Bal<200000) {
			System.out.println("Loan eligible Rs. 3 lakh");
		}else if (Bal<300000) {
			System.out.println("Loan eligible Rs. 10 lakh");
		}
	}
	void nestedifstatement() {
		int Bal = 100000;
		if (Bal > 10000) {
					if (Bal < 100000) {
						if (Bal < 50000) {
							System.out.println("Loan amount 25k");
						} else {
							System.out.println("Loan amount 50k");
						}
					} else {
						System.out.println("Loan amount 2 Lakh");
					}
		    	}
			}
void switchStatement() {
		
		String Name = "Abhishek";
		
		switch(Name) {
			
			case "Ram":  System.out.println("Ram name");
						  break;
						  
			case "Amit" : System.out.println("Amit name");
			  			  break;
			  			   
			case "Rohit" : System.out.println("Rohit name");
			  			  break;
			
			case "Harshal" : System.out.println("harshal name");
			  			  break;
			case "Arjun":  System.out.println("Arjun name");
			  			  break;
			  
			case "Amar" : System.out.println("Amar name");
						  break;
			   
			case "Abhinav" : System.out.println("Abhinav name");
						  break;

			case "Madhur" : System.out.println("Madhur Name");
						  break;
			  			  
			default: System.out.println("Invalid Name");
		}
		
	}
	
}

public class controljava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		madhur as = new madhur();
		as.ifstatement();
		as.ifelseifStatement();
		as.nestedifstatement();
		as.switchStatement();
	}

}
