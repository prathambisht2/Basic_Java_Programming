package lec_1;
import java.util.*;

public class count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int count=0;
		
		while(n1>0) {
			int rem=n1%10;
			n1=n1/10;
			if(rem==n2) {
				count++;
			}
		}
		System.out.println(count);

	}

}
