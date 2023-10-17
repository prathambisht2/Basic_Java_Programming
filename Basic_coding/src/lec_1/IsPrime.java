
package lec_1;

import java.util.*;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int factor = 0;
		int i = 1;
		if (num == 1) {
			System.out.println("niether prime nor composite");
			return;
		}
		while (i  <= num) {
			if (num % i == 0) {

				factor++;

			}
			i++;

		}
		System.out.println("No of factors of " + num + " are " + factor);

		if (factor == 2) {
			System.out.println("Prime");
		}

		else {
			System.out.println("Not Prime");
		}

	}

}
