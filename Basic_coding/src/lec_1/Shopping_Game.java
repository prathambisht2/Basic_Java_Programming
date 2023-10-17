package lec_1;

import java.util.*;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		while (n > 0) {
			
			int max_a = scn.nextInt();
			int max_h = scn.nextInt();

			int phone = 1;
			int a = 0;
			int h = 0;

			while (true) {
				a = a + phone;
				phone++;

				if (a > max_a) {
					System.out.println("Harshit");
					break;
				}

				h = h + phone;
				phone++;

				if (h > max_h) {
					System.out.println("Aayush");
					break;
				}

			}
			n--;

		}

	}

}
