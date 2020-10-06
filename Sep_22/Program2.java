

import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		int n=Integer.parseInt(br.readLine());
		while(n<=50) {
			sum=sum+n;
			n=Integer.parseInt(br.readLine());
		}
		System.out.println("sum = "+sum);
	}
}

