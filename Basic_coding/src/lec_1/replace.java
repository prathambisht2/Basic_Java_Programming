package lec_1;

import java.util.*;

public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		int power=1;
	//	int ans2=0;
		
		while (n > 0) {
			int rem=n%10;
			if(rem==0) {
				rem=5;
			}
		
			n=n/10;
			ans=ans+rem*power;
			power=power*10;
			
			
		}
		System.out.println(ans);
		
	/*	while(ans>0) {
			int rem2=ans%10;
			
			ans2=ans2*10+rem2;
			ans=ans/10;
		}
		System.out.println(ans2);*/
		
	}

}
