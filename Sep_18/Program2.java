

import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
		for(int i=x;i<=y;i++) {
			if(i%2==0) {
				System.out.print(i*i+" ");
			}else {
				System.out.print(i*i*i+" ");
			}
		}
		System.out.println();
	}
}


