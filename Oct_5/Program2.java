


import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the rows And columns of matrix");
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int marr[][]=new int[m][n];
		int marr1[][]=new int[m][n];
		int ceven=0,max=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				marr[i][j]=Integer.parseInt(br.readLine());
				if(marr[i][j]%2==0) {
					ceven=ceven+marr[i][j];
				}
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(marr[i][j]%2!=0) {
					if(marr[i][j]>max)
						max=marr[i][j];
				}
			}
		}
		
		System.out.println(max*ceven);
	}
}



