

import java.io.*;
class Sample {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of Rows: ");
		int rows=Integer.parseInt(br.readLine());
		System.out.println("Enter no of Columns: ");
		int cols=Integer.parseInt(br.readLine());
		int marr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {

			for(int j=0;j<cols;j++) {

				marr[i][j]=Integer.parseInt(br.readLine());

			}
		}
		System.out.println("Matrix Before transpose: ");
		for(int i=0;i<rows;i++) {

			for(int j=0;j<cols;j++) {

				System.out.print(marr[i][j]+" ");

			}
			System.out.println();
		}
		System.out.println("Matrix after transpose: ");
		for(int i=0;i<rows;i++) {

			for(int j=0;j<cols;j++) {

				System.out.print(marr[j][i]+" ");

			}
			System.out.println();
		}	
	}
}



