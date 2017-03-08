import java.util.Scanner;

public class Alpha {
	public static void main(String[] args) {
		char c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter:");
		c=s.next().charAt(0);
		if((c>='A'&&c>='Z')||(c>='a'&&c>='z'))
		{
			System.out.println("Is alphabet"+c);
		}
		else
		{
			System.out.println("IS not alphabet"+c);
		}

	}
}
	