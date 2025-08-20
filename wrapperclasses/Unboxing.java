package wrapperclasses;

public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intObj = Integer.valueOf(10);
        Character charObj = Character.valueOf('A');
        Double doubleObj = Double.valueOf(25.5);
        Boolean boolObj = Boolean.valueOf(true);

        
        int num = intObj.intValue();         
        char ch = charObj.charValue();       
        double d = doubleObj.doubleValue();  
        boolean flag = boolObj.booleanValue(); 

        
        System.out.println("Unboxed int: " + num);
        System.out.println("Unboxed char: " + ch);
        System.out.println("Unboxed double: " + d);
        System.out.println("Unboxed boolean: " + flag);


	}

}
