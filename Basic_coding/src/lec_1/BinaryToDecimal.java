package lec_1;
import java.util.*;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int power=0;
        int ans=0;

        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans+rem*(int)Math.pow(2,power);
            power++;
        }
        System.out.println(ans);


	}

}
