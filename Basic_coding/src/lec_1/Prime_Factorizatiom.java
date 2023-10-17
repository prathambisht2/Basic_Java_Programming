package lec_1;
import java.util.*;

public class Prime_Factorizatiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i=2;
		
		if(n==1) {
			System.out.println("Prime factor of 1 is 1");
		}
		while(n>1) {
			
			while(n%i==0) {
				System.out.print(i + " ");
				n=n/i;
			}
			i++;
		}
		
		

	}

}
