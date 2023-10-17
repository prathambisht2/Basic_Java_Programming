package lec_1;
import java.util.*;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int i=1;
		int cnt=1;
		while(cnt<=n1){
			if((3*i+2)%n2!=0) {
				System.out.println(3*i+2);
				cnt++;
			}
			i++;
		}

	}

}
