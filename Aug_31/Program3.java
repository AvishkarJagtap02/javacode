

import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			int c=i*i*i,s=i*i;
			System.out.println("Cube of "+i+":"+c+" and Square of "+i+":"+s);
		}
	}
}
		


