
public class StaticTest {
	static {
		System.out.println("inside static block ***");
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
	}
	static {
		System.out.println("inside static block **");
	}
}
