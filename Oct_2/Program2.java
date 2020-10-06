import java.io.*;
class Sample {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of Rows: ");
		int rows=Integer.parseInt(br.readLine());
		System.out.println("Enter no of Columns: ");
		int cols=Integer.parseInt(br.readLine());
		int marr[][]=new int[rows][cols];
		int sum=0;
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {


				marr[i][j]=Integer.parseInt(br.readLine());
				if(marr[i][j]%2==0)
					sum=sum+marr[i][j];
			
			}
		}
	
		System.out.println("Entered Matrix is: ");
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {

				System.out.print(marr[i][j]+" ");
			
			}
			System.out.println();
		}
		System.out.println("Sum of Even Numbers of Array is: "+sum);
		System.out.println("Even numbers are :");
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {

				if(marr[i][j]%2==0)
					System.out.println(marr[i][j]+" ");
			}
		}
	}
}



