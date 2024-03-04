package javapratices;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Write a program to check wheather the string is palindrome or not
		String str ="Arpit";
		String Str1 ="";
		for (int i = str.length()-1;i>=0;i--)
		{
			Str1 = Str1+str.charAt(i);
		}
		if(str.equals(Str1))
		{
			System.out.println("\n"+Str1+": String is Palindrom .");
		}
		else
		{
			System.out.println("\nString is not Palindrom");
		}
	}

}
