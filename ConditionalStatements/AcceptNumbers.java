package ConditionalStatements;

public class AcceptNumbers {

	public static void main(String[] args) {
		 int[] numbers = {3, 7, 2, 0};  
	        for (int num : numbers) {
	            if (num == 0) break;
	            System.out.println("You entered: " + num);
	        }

	}

}
