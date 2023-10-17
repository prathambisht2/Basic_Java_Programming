package lec_1;
import java.util.*;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int pos=1;
		int ans=0;
		
		while(n>0) {
			int digit=n%10;
		//	System.out.println(digit + " - " + pos);
			ans=ans+pos*(int)Math.pow(10, digit-1);
			pos++;
			n=n/10;
		}
		System.out.println(ans);

	}

}
