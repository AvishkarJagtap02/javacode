import java.io.*;
class Sample {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of Rows: ");
		int rows=Integer.parseInt(br.readLine());
		System.out.println("Enter no of Columns: ");
		int cols=Integer.parseInt(br.readLine());
		int marr[][]=new int[rows][cols];
		int sum1=0,sum2=0;
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {

				marr[i][j]=Integer.parseInt(br.readLine());
			
			}
		}
		System.out.println("Entered Matrix is: ");
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {

				System.out.print(marr[i][j]+" ");
			
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {
				
				sum1=sum1+marr[i][j];
			
			}
				System.out.println("Addition of row "+i+" :"+sum1);
		}
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {
				
				sum2=sum2+marr[j][i];
			
			}
				System.out.println("Addition of column "+i+" :"+sum2);
		}
	}
}



