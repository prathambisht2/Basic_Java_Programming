package lec_1;

import java.util.*;

public class chewbacca_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 		Scanner scn=new Scanner(System.in);
		 		long n=scn.nextLong();
		 		long ans=0;
		 		long power=1;
			
	           
	            while(n>0) {
			        long rem=n%10;
	                if (n!=9 && rem>=5){
	                    rem=9-rem;
	                }
				    
				    ans=ans+rem*power;
	                power=power*10;
				    n=n/10;
			    }
	            System.out.println(ans);
		
		
		

	}

}
