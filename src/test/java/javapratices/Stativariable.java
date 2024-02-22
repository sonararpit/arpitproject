package javapratices;

public class Stativariable
{
	int a=20; //Non static variable
	int b=40; //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stativariable S1 = new Stativariable();	
		Stativariable S2 = new Stativariable();
		Stativariable S3 = new Stativariable();
		
		System.out.println("variable a using Object S1: " +S1.a); //10
		System.out.println("variable a using Object S2: " +S2.a); //10
		System.out.println("variable a using Object S3: " +S3.a); //10
		
		S1.a = 100;
		
		System.out.println("variable a using Object S1: " + S1.a); //100
		System.out.println("variable a using Object S2: " + S2.a); //10
		System.out.println("variable a using Object S3: " + S3.a); //10
		
		System.out.println("Static variable b using Object S1:" + S1.b);
		System.out.println("Static variable b using Object S2:" + S2.b);
		System.out.println("Static variable b using Object S3:" + S3.b);
		
		S2.b =200;
		
		System.out.println("Static variable b using Object S1:" + S1.b); //200
		System.out.println("Static variable b using Object S2:" + S2.b); //200
		System.out.println("Static variable b using Object S3:" + S3.b); //200
	}

}
