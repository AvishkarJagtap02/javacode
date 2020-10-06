
//java program to print addition of all elements in 3d array

import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       		System.out.println("Enter Number of Planes: ");
	 	int plane=Integer.parseInt(br.readLine());
       		System.out.println("Enter Number of rows: ");
	 	int rows=Integer.parseInt(br.readLine());
       		System.out.println("Enter Number of columns: ");
	 	int columns=Integer.parseInt(br.readLine());
		int arr[][][]=new int[plane][rows][columns];
		int sum=0;
		for(int i=0;i<plane;i++) {
			for(int j=0;j<rows;j++) {
				for(int k=0;k<columns;k++) {
					arr[i][j][k]=Integer.parseInt(br.readLine());
					sum=sum+arr[i][j][k];
				}
			}
		}
		System.out.println("sum = "+sum);
	}
}


