


import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size for the both arrays(odd Size only) ");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			if(arr1[i]==2)
				arr1[i]=0;
			arr1[i]=sc.nextInt();
			if(arr1[i]%2==0) {
				arr2[i]=-1;
			}
		}
		System.out.println("First array");
		for(int i=0;i<n;i++) {
			System.out.println(+arr1[i]);
		}
		System.out.println("Second array");
		for(int i=0;i<n;i++) {
			if(arr2[i]==2)
				arr2[i]=0;
			System.out.println(+arr2[i]);
		}
	}
}


