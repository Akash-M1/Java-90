
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka limited";
		
		System.out.println("size = " + str.length());
		
		System.out.println("character @ index 0 = " + str.charAt(0));
		//System.out.println("character @ index 15 = " + str.charAt(15)); //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("index of \"e\" = " + str.indexOf("e"));
		System.out.println("index of \"e\" from 1 = " + str.indexOf("e",1));
		System.out.println("index of \"limited\" = " + str.indexOf("limited"));
		System.out.println("index of \"java\" = " + str.indexOf("java")); //-1
		System.out.println("last index of \"e\" = " + str.lastIndexOf("e"));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str.replace('e', '*'));
		System.out.println(str);
		
		str = "java is a programming language";
		String[] words = str.split(" ");
		for(String word : words) {
			System.out.println(word);
		}
	}
}
