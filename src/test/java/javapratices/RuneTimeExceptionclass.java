package javapratices;

public class RuneTimeExceptionclass
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuneTimeExceptionclass r = new RuneTimeExceptionclass();
		//System.out.println(r.division (100,0));
		System.out.println(r.division(100,30));
		
		//String s = null;
		String s = "Codemind";
		System.out.println(s.length());
		
		//String ss="12345d#";
		String ss ="1234";
		int number = Integer.parseInt(ss);
		System.out.println(number);
		
		String sss = "Codemind";
		System.out.println(sss.charAt (8));
		System.out.println(sss.charAt(7));
		
		char a[] = sss.toCharArray();
		System.out.println(a[8]);
		//System.out.println(a[8]);
	}
 public float division(int num1, int num2)
 {
	 return num1/num2;
 }
}
