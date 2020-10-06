

import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The Series of all Perfect Number from 1 to "+n+" is:");
		System.out.print("1\t");
		int sum;
		for(int i=1;i<=n;i++) {
			sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
	        if(sum==i)
			System.out.print(i+"\t");
		}
		System.out.println();
	}
}
