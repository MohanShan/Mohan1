import java.util.Scanner;

public class vowel {
	public static void main(String args[])
	{
		char c;
		Scanner scan=new Scanner(System.in);
		c=scan.next().charAt(0);
		if((c=='A') || (c=='E') || (c=='I') || (c=='O') || (c=='U')||
		(c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u'))
		{
			System.out.println("char is vowel");
		}
		else
		{
			System.out.println(" the char is not vowel");
		}		
	}

}
