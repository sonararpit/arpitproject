package javapratices;

public class ThrowAndThrowKeyword {

	int age = 17;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowAndThrowKeyword t = new ThrowAndThrowKeyword();
		t.eligibleForVoting();
	}
	
	public void eligibleForVoting()
	{
		if (age >= 18)
		{
			System.out.println("user is eligible for voting");
		}
		if (age<18)
		{
			throw new ArithmeticException("Sorry your not eligible for voting");
		}
	}

}
