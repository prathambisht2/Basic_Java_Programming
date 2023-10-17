package lec_1;
import java .util.*;

public class input_reverser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int ans=0;
		int power=1;
		while(n>0) {
			int t=scn.nextInt();
			ans=ans+t*power;
			n=n-1;
			power=power*10;
		}
		System.out.println(ans);

	}

}
