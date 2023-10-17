package lec_1;
import java.util.*;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i=1;
		int a=0;
		int b=1;
		while(i<=n) {
			//will print fibonacci series
			//System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
			i++;
		}
		//will print nth fibonacci number
		System.out.println( a);

	}

}
