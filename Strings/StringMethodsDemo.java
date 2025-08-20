package Strings;

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  Java Programming Language  ";

        // Different string methods
        System.out.println("Original String: \"" + str + "\"");
        System.out.println("Length: " + str.length());
        System.out.println("To Uppercase: " + str.toUpperCase());
        System.out.println("To Lowercase: " + str.toLowerCase());
        System.out.println("Trimmed: \"" + str.trim() + "\"");
        System.out.println("Substring (5, 16): " + str.substring(5, 16));
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Index of 'Program': " + str.indexOf("Program"));
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
        System.out.println("Does string start with '  Ja'? " + str.startsWith("  Ja"));
        System.out.println("Does string end with 'age  '? " + str.endsWith("age  "));
        System.out.println("Is string empty? " + str.isEmpty());

	}

}






