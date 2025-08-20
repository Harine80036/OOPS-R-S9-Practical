package wrapperclasses;

public class programaboutalldatauseage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            byte byteVal = 10;
		        Byte byteObj = byteVal;        
		        byte byteUnboxed = byteObj;   
		        System.out.println("byte: " + byteVal + ", Byte: " + byteObj + ", Unboxed: " + byteUnboxed);

		        
		        short shortVal = 200;
		        Short shortObj = shortVal;
		        short shortUnboxed = shortObj;
		        System.out.println("short: " + shortVal + ", Short: " + shortObj + ", Unboxed: " + shortUnboxed);

		        
		        int intVal = 5000;
		        Integer intObj = intVal;
		        int intUnboxed = intObj;
		        System.out.println("int: " + intVal + ", Integer: " + intObj + ", Unboxed: " + intUnboxed);

		        
		        long longVal = 100000L;
		        Long longObj = longVal;
		        long longUnboxed = longObj;
		        System.out.println("long: " + longVal + ", Long: " + longObj + ", Unboxed: " + longUnboxed);

		       
		        float floatVal = 12.34f;
		        Float floatObj = floatVal;
		        float floatUnboxed = floatObj;
		        System.out.println("float: " + floatVal + ", Float: " + floatObj + ", Unboxed: " + floatUnboxed);

		        
		        double doubleVal = 123.456;
		        Double doubleObj = doubleVal;
		        double doubleUnboxed = doubleObj;
		        System.out.println("double: " + doubleVal + ", Double: " + doubleObj + ", Unboxed: " + doubleUnboxed);

		       
		        char charVal = 'A';
		        Character charObj = charVal;
		        char charUnboxed = charObj;
		        System.out.println("char: " + charVal + ", Character: " + charObj + ", Unboxed: " + charUnboxed);

		      
		        boolean boolVal = true;
		        Boolean boolObj = boolVal;
		        boolean boolUnboxed = boolObj;
		        System.out.println("boolean: " + boolVal + ", Boolean: " + boolObj + ", Unboxed: " + boolUnboxed);

		        
		        int sum = intObj + byteObj + shortObj;
		        double mix = doubleObj + floatObj + longObj;
		        System.out.println("Sum of int + byte + short = " + sum);
		        System.out.println("Mix of double + float + long = " + mix);

		       
		        if (boolObj) { 
		            System.out.println("Boolean object evaluated to TRUE");
		        }
		    }
		}

		
	
		





        