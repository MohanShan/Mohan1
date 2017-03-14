import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String ss=""+a;
		int b=0,c=a;
		double pow=0;
		while(a!=0){
			b=a%10;
			a=a/10;
			pow=pow+(Math.pow(b, ss.length()));
		}
		System.out.println(pow);
		if(pow==c)
		{
			System.out.println("Amstrong");
		}
		else{
			System.out.println("Not Amstrong");
		}
			
	}
}