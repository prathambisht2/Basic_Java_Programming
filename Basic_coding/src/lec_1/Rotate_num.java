package lec_1;
import java.util.*;

public class Rotate_num {

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
		for(int r=1;r<=rot;r++) {
			int p1=n/10;
			int p2=n%10;
			
			int ans=p1+p2*(int)Math.pow(10,nod-1);
			System.out.println(r + "----->" + ans);
			n=ans;
		}
		
		
	}

}
