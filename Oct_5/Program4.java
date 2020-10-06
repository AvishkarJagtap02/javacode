

import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of rows: ");
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		for(int i=0;i<10;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter index at wich you want to add element(index): ");
		int index=Integer.parseInt(br.readLine());
		System.out.println("Enter number to  add (new number): ");
		int num=Integer.parseInt(br.readLine());
		arr[index]=num;
		System.out.println("New Array :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}


