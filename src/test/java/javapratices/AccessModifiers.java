package javapratices;

public class AccessModifiers 
{
		int a=50; //Default Access Modifier
		public int b = 100; // Public Access Modifier
		private int c =80; //Private Access Modifier
		protected int d =40; // Protected Access Modifier
		
		void PrintprivateVariable() 
		{
			System.out.println("Private variable c: " +c);
		}

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			AccessModifiers H = new AccessModifiers(); //Object
			System.out.println("Accessing Default Access Modifier a : "+ H.a);
			System.out.println("Accessing Public Access Modifier b : " + H.b);
			
			System.out.println("Accessing private Access Modifier c : " + H.c);
			H.PrintprivateVariable(); //Accessing show method to print private variable
			System.out.println("Accessing Protected Access Modifier d : " + H.d);
	}

}
