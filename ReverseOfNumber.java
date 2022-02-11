import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,r,rev=0,sum=0;
		System.out.println("Enter the number : ");
		n=s.nextInt();
		int temp = n;
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
			sum=sum+r;
		}
		System.out.println(""+rev+" is the reverse of the number");	
		System.out.println(""+sum+" is the sum of digits of the number");
	}

}
