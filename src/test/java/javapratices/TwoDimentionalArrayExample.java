package javapratices;

public class TwoDimentionalArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{10,20,30}, {40,50,60}, {70,80,90}};
		
		System.out.println(arr[0][0]); // 10
		System.out.println(arr[0][2]); // 30
		System.out.println(arr[2][1]); // 80
		System.out.println(arr[2][2]); // 90
		
		
		for (int i=0; i<arr.length; i++) { // Row
			
			for(int j=0; j<arr.length; j++) { // Column
				
				System.out.print(arr[i][j] + "\t");
				
			}
			
			System.out.println();
			
		}
		
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) { // Row
			
			for(int j=0; j<arr.length; j++) { // Column
				
				if (i == j) {
					System.out.println("Diagonal element: " + arr[i][j]);
					sum = sum + arr[i][j];
				}
				
			}
			
		}
		
		System.out.println("Sum : " + sum);
		
	}

}
