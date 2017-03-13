import java.util.Scanner;

public class Primeintravel {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int n=0;
		for(int i=a;i<=b;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0){
					n=0;
					break;
				}
				else{
					n=1;
				}
			}
			if(n==1)
			{
				System.out.println(i);
			}
		}
	}
}