package lec_1;

import java.util.*;

public class Unique_Prime_Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 2;

		if (n == 1) {
			System.out.println("Prime factor of 1 is 1");
		}
		while (i <= n) {
			int isFact = 0;
			while (n % i == 0) {
				isFact = 1;
				n = n / i;
			}
			if (isFact == 1) {
				System.out.print(i + " ");
			}
			i++;
		}

	}

}
