

import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of all elemnts in array is :"+sum);
	}
}

