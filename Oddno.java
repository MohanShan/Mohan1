import java.util.Scanner;

public class Oddno {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		for(int i=m;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			
		}
	}
	
}
