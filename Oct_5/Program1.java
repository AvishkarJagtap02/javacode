
//Multiplication of two array elements into third array

import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of arrays");
		int n=Integer.parseInt(br.readLine());
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		int[] a=new int[n];
		int mul=0;
		System.out.println("Enter the Elements  of first array");
		for(int i=0;i<n;i++) {
			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the Elements  of Second array");
		for(int j=0;j<n;j++) {
			arr2[j]=Integer.parseInt(br.readLine());
		}
		System.out.println("After the operation the elements in third array is: ");
		for(int j=0;j<n;j++) {
			mul=arr1[j]*arr2[j];
			a[j]=mul;
			System.out.println(a[j]);
		}
	}
}

		
