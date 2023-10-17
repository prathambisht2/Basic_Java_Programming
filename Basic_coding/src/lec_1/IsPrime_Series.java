package lec_1;

import java.util.*;

public class IsPrime_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int i = 1;

		while (i <= n) {

			int div = 1;
			int factor = 0;

			while (div <= i) {
				if(i%div==0) {
					factor++;
				}
				div++;
			}

			if (factor == 2) {
				System.out.println(i);
			}

			i++;

		}

	}

}
