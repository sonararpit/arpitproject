package javapratices;

public class Rank {

	int a;
	int b;

	public Rank (int c, int d)
	{
		a = c;
		b =d;
	}
	public static void main(String[] args) {
		Rank r = new Rank(100,0);
		System.out.println(r.numbersDevision());
	}
	public int numbersDevision()
	{
		int d = 0;
		try {
			d= a/b;
		}
		catch (NullPointerException e){
			System.out.println(("Please do not try to devide by 0"));
		}
		catch (Throwable e){
			System.out.println("Please do not try devide by 0");
		}
		finally 
		{
			System.out.println("code form finally block");
		}
	//	catch (NullPointerException e){
	//	//TODO: handle exception
	//	}catch(NumberFormatException e){
	//		//TODO: handle exception
	//	}catch (Exception e){
	//		//TODO: handle exception
	//	}finally{
	// }

		System.out.println("devision of " + a +"and"+b+"is"+d);
		return d;
	}
}