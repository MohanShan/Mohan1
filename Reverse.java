package Mohan;

public class Reverse {
public static void main(String[] args) {
	int a=456,n;
	int rev=0;
	while(a!=0)
	{
		n=a%10;
		rev=rev*10+n;
		a=a/10;
		
	}
	
	System.out.println(rev);
}
}
