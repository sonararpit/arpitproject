package javapratices;

public class JumpStatement 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Break statement example


		for(int i=1;i<=10;i++) {

			if(i==5) {
				break;
			}

			System.out.println("Value of I: " + i);
		}

		// Continue statement example

		for(int i=1;i<=10;i++) {

			if(i==5) {
				continue;
			}

			System.out.println("Value of I: " + i);
		}
	}

}
