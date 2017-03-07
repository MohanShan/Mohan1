import java.util.Scanner;


public class Sumnum {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int sum=0;
		int size=s.nextInt();
		int[] i=new int[size];
		System.out.println("size="+size);
		for(int j=0;j<i.length;j++){
			i[j]=s.nextInt();
			sum=sum+i[j];
		}
		
		System.out.println(sum);
	}

}
