
public class IntegerTypes {

	public static void main(String[] args) {
		byte b = 127;
		//byte b = 128;//Type mismatch: cannot convert from int to byte
		System.out.println(b);		
	
		//long pop = 2147483647;
		long pop = 2147483648L;
		System.out.println("world population = " + pop);
		
		int n = (int)12L; //type-casting
		System.out.println(n);
	}

}
