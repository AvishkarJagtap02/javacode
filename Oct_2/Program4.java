import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException{
		int i,j,n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		int A[][]=new int[n][n];
		int B[][]=new int[n][n];
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				A[i][j]=Integer.parseInt(br.readLine());
			}
		}
			hourGlass(A,n);
		
	}
 static void hourGlass(int mat[][],int n) {
                for(int i=0;i<n-2;i++) {
                        for(int j=0;j<n-2;j++) {
                                System.out.println(""+mat[i][j]+" "+mat[i][j+1]+" "+mat[i][j+2]+"\n"+mat[i+1][j+1]+"\n"+mat[i+2][j]+" "+mat[i+2][j+1]+" "+mat[i+2][j+2]+"\n");
			}			
                }
        }
}

