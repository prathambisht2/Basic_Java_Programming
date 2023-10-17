package lec_1;

public class ArmStrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=500;
		PrintAllArm(n);

	}
	
	public static void PrintAllArm(int n) {
		for(int i=1;i<=n;i++) {
			if(isArm(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isArm(int num) {
		int count=No_of_dig(num);
		int sum=0;
		int copy_num=num;
		while(num>0) {
			int rem=num%10;
			sum=sum+(int)Math.pow(rem,count);
			num=num/10;
		}
		
		if(copy_num==sum) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static int No_of_dig(int num) {
		int count=0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			count++;
		}
		return count;
	}

}
