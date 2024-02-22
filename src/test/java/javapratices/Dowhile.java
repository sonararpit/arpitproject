package javapratices;


class ME 
{
	void evenodd()
	{
		System.out.println("even Number :");
		int i=1;
		do
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		while(i<=10);
		
		System.out.println("odd number : ");
		int k=1;
		do
		{
			if(k%2!=0)
			{
				System.out.println(k);
			}k++;
		}
		while (k<=10);
	}
}


public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ME As = new ME();
		As.evenodd();
	}

}
