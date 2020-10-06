

//java Program to print even numbers in 3d array

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
				}
			}
		}

		System.out.println("Even Numbers are: ");
		for(int i=0;i<plane;i++) {
			for(int j=0;j<rows;j++) {
				for(int k=0;k<columns;k++) {
					if(arr[i][j][k]%2==0)
						System.out.println(arr[i][j][k]+" ");
				}
			}
		}
	}
}


