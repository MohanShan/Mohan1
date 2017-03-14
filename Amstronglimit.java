import java.util.Scanner;

public class Amstronglimit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int ns=s.nextInt();
		int b;
		int w=a;
		for(int i=w;i<=ns;i++)
		{
			int c=i;//100
			int cc=i;//100
		String s1=""+cc;
		int yy=s1.length();
		double pow=0;
		while(cc!=0)
		{
			b=cc%10;
			cc=cc/10;
			pow=pow+(Math.pow(b,yy));
			//System.out.println(b);
		}
		
		
		if(pow==c)
		{
			System.out.println(pow);
		}
		pow=0;
		}
	}
}

		