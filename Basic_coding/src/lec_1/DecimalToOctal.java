package lec_1;
import java.util.*;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
	        int n=scn.nextInt();
	        int power=1;
	        int ans=0;

	        while(n>0){
	            int rem=n%8;
	            n=n/8;
	            ans=ans+rem*power;
	            power=power*10;
	        }
	        System.out.println(ans);


	}

}
