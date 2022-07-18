import java.util.Scanner;

class ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Bank bank = null;

		System.out.print("which bank's card [1.SBI|2.ICICI]: ");
		int cardType = sc.nextInt();

		switch(cardType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("###--- CARD READ ERROR ---###");
				return;
		}//switch

		System.out.println("\n========================================================");
		System.out.println("\t\tWELCOME TO " + bank.getClass().getName().toUpperCase());
		System.out.println("========================================================");		

		bank.deposit(1000);
		bank.withdraw(500);
	}
}
