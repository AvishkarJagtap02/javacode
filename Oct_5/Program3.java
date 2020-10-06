import java.io.*;
class Sample {
        public static void main(String args[]) throws IOException {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows And columns of matrix");
                int m=Integer.parseInt(br.readLine());
                int n=Integer.parseInt(br.readLine());
                int marr[][]=new int[m][n];
                int marr1[][]=new int[m][n];
                int sum[][]=new int[m][n];
                for(int i=0;i<m;i++) {
                        for(int j=0;j<n;j++) {
                                marr[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                for(int i=0;i<m;i++) {
                        for(int j=0;j<n;j++) {
                                marr1[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                System.out.println("The Third Matrix is: ");
                for(int i=0;i<m;i++) {
                        for(int j=0;j<n;j++) {
                                sum[i][j]=marr[i][j]+marr1[i][j];
                                System.out.print(sum[i][j]+" ");
                        }
			System.out.println();
                }
        }
}

