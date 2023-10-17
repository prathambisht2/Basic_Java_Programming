package lec_1;
import java.util.*;

public class F_To_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int Min_f=scn.nextInt();
		int Max_f=scn.nextInt();
		int step=20;
		
		while(Min_f<=Max_f) {
			System.out.print(Min_f + "\t");
			int cel=(5*(Min_f-32))/9;
			//System.out.println(ToCelsius(Min_f));
			System.out.println(cel);
			Min_f+=20;
		}

	}
	
/*	public static int ToCelsius(int f) {
		int cel=(5*(f-32))/9;
		return cel;
		//System.out.println(cel);
		
	}
	
*/	

}
