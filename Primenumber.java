import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=0;int d=0;
		d=m/2;
		for(int i=2;i<=d;i++)
		{
			if(m%i==0)
			{
			System.out.println("This num is not prime");
			n=1;
			break;
			}
		}	
		if(n==0)
		{
			System.out.println("This num is prime");
		}

}
}