package Mohan;

public class Palindrom {
public static void main(String[] args) {
	int a=546,n;
	int b=a;
	int rev=0;
	while(a!=0)
	{
		n=a%10;
		rev=rev*10+n;
		a=a/10;
		
	}
	if(b==rev)
	{
		System.out.println("Palindrom");
	}
	else
	{
		System.out.println("Not palindrom");
	}
}
}
