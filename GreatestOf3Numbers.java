import java.util.Scanner;

public class GreatestOf3Numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a : ");
		a=s.nextInt();
		System.out.println("Enter b : ");
		b=s.nextInt();
		System.out.println("Enter c : ");
		c=s.nextInt();
		if(a>b & a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a & b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
