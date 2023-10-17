package lec_1;
import java.util.*;

public class AnybaseToAnybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
	        int sb=scn.nextInt();
	        int db=scn.nextInt();
	        int n=scn.nextInt();
	        int power=0;
	        int ans=0;
	        int p=1;
	        int ans2=0;

	        while(n>0){
	            int rem=n%10;
	            n=n/10;
	            ans=ans+rem*(int)Math.pow(sb,power);
	            power++;
	        }

	        while(ans>0){
	            int rem=ans%db;
		            ans=ans/db;
		            ans2=ans2+rem*p;
		            p=p*10;
	        }

	        System.out.println(ans2);

	}

}
