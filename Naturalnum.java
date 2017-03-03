import java.util.Scanner;

public class Naturalnum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] i=new int[size];
		for(int j=0;j<i.length;j++)
		{
			i[j]=s.nextInt();
		}
		int sum=0;
		for(int h=0;h<i.length;h++)
		{
			sum=sum+i[h];
		}
		System.out.println(sum);
	}

}
