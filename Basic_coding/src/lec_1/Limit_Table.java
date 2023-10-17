package lec_1;
import java.util.*;

public class Limit_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int i=1;
		while(n1*i<=n2) {
			System.out.println(n1*i);
			i++;
		}

	}

}
