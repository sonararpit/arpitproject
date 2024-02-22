package javapratices;

public class programwitharray 
{

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for (int i = 0; i<numbers.length;i++)
		{
			for (int j = i + 1; j< numbers.length; j++)
			{
				if (numbers[i]< numbers[j])
				{
					int temp = numbers[i];
					numbers[i]= numbers[j];
					numbers[j]= temp;
				}
			}
		}
		for(int a : numbers)
		{ System.out.println(a);
		}
		System.out.println("#################################");
		char chars[] = {'a','b','c','d','e','f','i','l','x','y','z'};
		for (int i=0;i< chars.length;i++)
		{
			for(int j = i+1; j<chars.length;j++)
			{
				if(chars[i]>chars[j])
				{
					char temp = chars[i];
					chars[i] = chars[j];
					chars[j] =temp;
				}
			}
		}
		for(char a : chars)
		{
			System.out.println(a);
		}

	}

}
