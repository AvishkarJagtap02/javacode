

import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum = "+sum);
	}
}	
