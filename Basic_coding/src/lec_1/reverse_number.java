package lec_1;
import java.util.*;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		
		
		int ans=0;
		
		while(n>0) {
			int rem=n%10;
			n=n/10;
		//	System.out.println(rem);
			ans=ans*10+rem;
			
		}
		System.out.println(ans);
		
		
		
		

	}

}
