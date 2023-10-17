package lec_1;
import java.util.*;

public class Lower_Upper_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner (System.in);
		char ch=scn.next().charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println("lower");
		}
		
		else {
			System.out.println("upper");
		}

	}

}
