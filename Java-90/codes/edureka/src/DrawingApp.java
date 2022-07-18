import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape sh = null;
		
		System.out.print("which shape to play with [1.Rectangle | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		 case 1:
			sh = new Rectangle("red" , 15 , 7);
			break;
		 case 2:
			sh = new Circle("blue" , 12.7f);
			break;			
		 default:
			 System.out.println("###--- NOT A SUPPORTED SHAPE --- CONTACT ADMIN ---###");
			 return;
		} //switch
		
		System.out.println("SHAPE SELECTED = " + sh.getClass().getName().toUpperCase());
		
		sh.area();
		
		System.out.println("Color of "+ sh.getClass().getName() + " = "+sh.getColor());
	}	
}
