package wrapperclasses;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
        char ch = 'A';
        double d = 25.5;
        boolean flag = true;

        
        Integer intObj = Integer.valueOf(num);     
        Character charObj = Character.valueOf(ch); 
        Double doubleObj = Double.valueOf(d);      
        Boolean boolObj = Boolean.valueOf(flag);   

        
        System.out.println("Boxed Integer: " + intObj);
        System.out.println("Boxed Character: " + charObj);
        System.out.println("Boxed Double: " + doubleObj);
        System.out.println("Boxed Boolean: " + boolObj);



	}

}
