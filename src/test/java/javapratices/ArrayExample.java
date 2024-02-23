package javapratices;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int counter = 0;
		
		System.out.println("1st Element: " + arr[0]);
		System.out.println("2nd Element: " + arr[1]);
		System.out.println("3rd Element: " + arr[2]);
		System.out.println("4th Element: " + arr[3]);
		System.out.println("5th Element: " + arr[4]);
		
		//System.out.println("10th Element: " + arr[9]);
		
		// Print the Array by using Loop
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Element at Index " + i + ":" + arr[i]);
		}
		
		// Print the Array using For-Each Loop
		
		for(int a: arr) {
			System.out.println("Element :" + a);
		}
		
		// Occurance of given element in Array 
		
		for(int i=0; i < arr.length; i++) {
			
			if (arr[i] == 10) {
				counter = counter + 1; // counter++
			} 
			
		}
		
		System.out.println("Element 10 is occured: " + counter + " times");
		
		
		// Array Reverse
		
		for(int i=arr.length-1; i >= 0; i--) {
			System.out.println("Element at Index " + i + ":" + arr[i]); // arr[5]
		}
	}

}
