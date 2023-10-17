package lec_1;

import java.util.Scanner;

public class Rotate_num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int rot=scn.nextInt();
		int backup=n;
		int nod=0;
		
		while(n>0) {
			nod++;
			n=n/10;
		}
		System.out.println(nod);
		
		rot=rot%5;
		System.out.println(rot);
		
		n=backup;
		
		int divisor=(int)Math.pow(10, rot);
		int p1=n/divisor;
		int p2=n%divisor;
		System.out.println(p1 + " - " + p2);
		int ans=p2*(int)Math.pow(10, nod-rot)+p1;
		System.out.println(ans);
		

	}

}
