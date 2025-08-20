package wrapperclasses;

public class autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primitiveInt = 10;
        Integer wrapperInt = primitiveInt;  // auto-boxing happens here

        // Auto-boxing for other types
        double primitiveDouble = 5.5;
        Double wrapperDouble = primitiveDouble; // auto-boxing

        char primitiveChar = 'A';
        Character wrapperChar = primitiveChar; // auto-boxing

        // Printing wrapped objects
        System.out.println("Integer value: " + wrapperInt);
        System.out.println("Double value: " + wrapperDouble);
        System.out.println("Character value: " + wrapperChar);

	}

}

