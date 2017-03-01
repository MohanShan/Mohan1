
public class Leapyear {
	public static void main(String[] args)
	{
		int a=2000;
		if((a%4==0 && a%100!=0)||a%400==0)
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("ordinary year");
		}
		
	}

}
