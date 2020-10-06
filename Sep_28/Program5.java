

import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("No of rows ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=1;j++) {
				if(i%2==0)
					System.out.print("10101");
				else 
					System.out.print("01010");

			}
			System.out.println();
		}
	}
}

