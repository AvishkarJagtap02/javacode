
import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Min of series");
		int m=sc.nextInt();
		System.out.println("Max of series");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}System.out.println();
	}
}

