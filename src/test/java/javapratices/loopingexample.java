package javapratices;


class AS
{
	 //print 1 to 10 
	 void forLoop() {
		 int i;
		 for(i=1;i<=10;i++) {
			 System.out.println("Value of i : " + i);
		 }
		 System.out.println("After loop : " + i);
		 //Increment Loop by 2
		 for (i=1;i<=10;i+=2) {
			 System.out.println("Value of i : " + i);
		 }
		 //Even-odd number
		 for(i=1;i<=10;i++) {
			 if (i%2==0) {
				 System.out.println("Even number : " + i);
			 }
			 if (i%2 !=0) {
				 System.out.println("Odd number: " +i);
			 }
		 }
		 //Reverse order 10 to 1
		 for(i=10;i>=1;i--) {
			 System.out.println("value if i : " +i);
		 }
	 }
	 
	 void whileLoop() {
		 //print 1 to 10
		 int i;
		 i=1;
		 while(i<=10) {
			 System.out.println("Value of I: "+i);
			 i++;
		 }
	 }
	 void dowhileLoop() {
		 int i;
		 i=1;
		 do {
			 System.out.println("Value of I: "+i);
			 i++;
		 } while(i<=10);
	 }
}
public class loopingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AS lt = new AS();
		lt.forLoop();
		lt.whileLoop();
		lt.dowhileLoop();
	}

}
