import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,r,rev=0;
		System.out.println("Enter the number : ");
		n=s.nextInt();
		int temp = n;
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("The number is a palindrome");			
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}

	}

}
