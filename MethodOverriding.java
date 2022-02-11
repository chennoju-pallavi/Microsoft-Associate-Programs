import java.util.Scanner;
public class MethodOverriding {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x;
	System.out.println("Hello");
	System.out.print("Enter x value : ");
	x=s.nextInt();
	try {
		System.out.println(x/0);
	}
	catch(Exception e) {
		System.out.println("Division not possible by 0");
	}
	System.out.println("Hi");
	}
}