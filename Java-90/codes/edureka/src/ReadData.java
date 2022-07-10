import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter some text");
		//String data = sc.next();
		String data = sc.nextLine();
		System.out.println(data);
		
		sc.close();
	}

}
