package wrapperclasses;

public class autounboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intObj = 100;    
        int intValue = intObj;    
        System.out.println("Integer object: " + intObj);
        System.out.println("Auto-unboxed int: " + intValue);

        
        Double doubleObj = 45.67; 
        double doubleValue = doubleObj; 
        System.out.println("Double object: " + doubleObj);
        System.out.println("Auto-unboxed double: " + doubleValue);

       
        Boolean boolObj = true;   
        boolean boolValue = boolObj; 
        System.out.println("Boolean object: " + boolObj);
        System.out.println("Auto-unboxed boolean: " + boolValue);

       
        Integer a = 10, b = 20;
        int sum = a + b; 
        System.out.println("Sum of " + a + " and " + b + " = " + sum);

        
        printSquare(intObj); 
        printSquare(25); 
    }

  
    static void printSquare(Integer number) {
        int result = number * number; 
        System.out.println("Square of " + number + " = " + result);

	}

}



