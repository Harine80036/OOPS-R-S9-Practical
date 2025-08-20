package arrays;
import java.util.Scanner;
public class SmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int smallest = arr[0];
	        int largest = arr[0];

	        for (int i = 1; i < n; i++) {
	            if (arr[i] < smallest) {
	                smallest = arr[i];
	            }
	            if (arr[i] > largest) {
	                largest = arr[i];
	            }
	        }

	        System.out.println("Smallest element = " + smallest);
	        System.out.println("Largest element = " + largest);

	        sc.close();

	}

}




