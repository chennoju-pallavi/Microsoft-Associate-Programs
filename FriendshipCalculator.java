import java.util.Random;
import java.util.Scanner;

public class FriendshipCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n1,n2;
		System.out.println("Enter your name: ");
		n1=s.nextLine();
		System.out.println("Enter your Friend name: ");
		n2=s.nextLine();
		System.out.println("Hello "+n1+" and "+n2+"");
		System.out.println("Your friendship percentage is : ");
		
		Random r=new Random();
		int v=r.nextInt(100);
		System.out.println(v);
		
	}

}