import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,n,sum=0;
		System.out.println("Enter the value of n : ");
		n=s.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(""+sum+" is the sum of first "+n+" numbers");

	}

}
