import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n1;
		System.out.println("Enter your name: ");
		n1=s.nextLine();
		System.out.println("\nWelcome Mr."+n1);
		System.out.println("MENU");
		int sum=0;
		while(true) {
		System.out.println("1.Tea\n2.Coffee\n3.Milkshake\n4.Maggie\n5.Chocolates\n");
		System.out.println("Enter your order: ");
		int op=s.nextInt();
		switch(op) {
		case 1:
			System.out.println("The cost of Tea is $10");
			sum=sum+10;
			break;
		case 2:
			System.out.println("The cost of Coffee is $20");
			sum=sum+20;
			break;
		case 3:
			System.out.println("The cost of Milkshake is $50");
			sum=sum+50;
			break;
		case 4:
			System.out.println("The cost of Maggie is $30");
			sum=sum+30;
			break;
		case 5:
			System.out.println("The cost of Chocoates is $100");
			sum=sum+100;
			break;
		case 6:
			System.out.println("Total bill is $" +sum+ " ");
			System.exit(op);
		default:
			System.out.println("Not available");	
			
		}
	 }
	}
}
