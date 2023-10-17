package lec_1;

import java.util.*;

public class Boston_Numbers {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int n2 = n;

		int sum = 0;

		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			sum = sum + rem;
		}
	//	System.out.println("the sum is n is " + sum);

		int div = 2;
		n = n2;
		int sumOfFac = 0;

		while (n > 1) {
			if (n % div == 0) {
				System.out.println(div);
				n = n / div;
				// int sumOfFac=sumOfFac+digit;
				int div_copy = div;
				while (div_copy > 0) {
					int digit = div % 10;
					sumOfFac = sumOfFac + digit;
					div_copy = div_copy / 10;
				}
			}
			else {
				div++;
			}
		}
	//	System.out.println(sum + " - " + sumOfFac);
		
		if(sum==sumOfFac) {
			System.out.println(1);
		}
		
		else {
			System.out.println(0);
		}

	}

}
