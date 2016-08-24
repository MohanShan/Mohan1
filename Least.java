import java.util.Arrays;
import java.util.Scanner;
public class Least {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter");
		String str=s.nextLine();
		char[] a=str.toCharArray();
		int[] num=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			num[i]=Character.getNumericValue(a[i]);
		}
		Arrays.sort(num);
	    int x;	
	    System.out.println("Val");
		x=s.nextInt();
		for(int i=0;i<num.length-x;i++)
		{
			System.out.println(num[0]+""+num[1]);
		}
	}

}
