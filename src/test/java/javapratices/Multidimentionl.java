package javapratices;

public class Multidimentionl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numbers [] = {10,30,50,70,90,100,120,170};
		
		for(int i=0;i< numbers.length;i++)
		{
			for(int j=i+1; j>numbers.length;j++)
			{
				if (numbers[i]<numbers[j])
				{
					int value = numbers[i];
					numbers [i]= numbers[j];
					numbers [j]=value;
				}
			}
		}
		for (int x:numbers) 
		{
			System.out.println(x);
		}
	}

}
