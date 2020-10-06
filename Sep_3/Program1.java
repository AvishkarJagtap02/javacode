
import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=true;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				flag=true;
			}
			else {
				flag=false;
			}
		}
		if(flag) {
			System.out.println(n+" is Perfect Number");
		}else {
			System.out.println(n+" is not a Perfect Number");
		}
	}
}
