

import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=0;
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("The largest element in the array is: "+max );
	}
}


