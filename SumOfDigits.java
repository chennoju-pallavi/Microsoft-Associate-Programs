import java.io.InputStream;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,sum=0,r;
		System.out.println("Enter the value of n : ");
		n=s.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("The sum of digits of number is "+sum+"");
	}	

}
