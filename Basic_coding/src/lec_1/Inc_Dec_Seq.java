package lec_1;

import java.util.*;

public class Inc_Dec_Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int prev = 0;
		boolean dec = false;
		boolean inc = false;
		boolean ans = false;

		int i = 1;
		while (i <= t) {
			int curr = scn.nextInt();

			if (i == 1) {
				dec = true;
				ans = true;
				prev = curr;
			}

			else if (prev == curr) {
				ans = false;
				break;
			}

			else if (curr > prev && dec == true && inc == false) {
				inc = true;
				dec = false;
				ans = true;
				prev = curr;
			}

			else if (curr > prev && dec == false && inc == true) {
				ans = true;
				prev = curr;
			}

			else if (curr < prev && dec == false && inc == true) {
				ans = false;
				break;
			}

			else if (curr < prev && dec == true && inc == false) {
				ans = true;
				prev = curr;
			}

			i++;
		}
		System.out.println(ans);
	}

}
