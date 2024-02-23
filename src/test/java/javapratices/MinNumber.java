package javapratices;

public class MinNumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {50,67,87,23,34};
			
			int min = arr[0];
			for (int i= 1;i<arr.length;i++)
			{
				if(arr[i]<min)
				{
					min = arr[i];
				}
			}
			System.out.println("Manimum number " +min);
	}

}
