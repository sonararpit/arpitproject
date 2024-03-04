package javapratices;

public class Occuranceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //1. Declare a String "Codemind" and find the occurance of character'd' in it
		
		String str = "CodeMind";
		int count = 0;
		for(int i=0; i<str.length();i++)
		{
			if (str.charAt(i)=='d')
			{
				count ++;
			}
		}
		System.out.println("\nThe Occurance of D "+count+" times");
		
	}

}
