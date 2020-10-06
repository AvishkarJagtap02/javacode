

import java.io.*;
class Sample {
        public static void main(String args[]) throws IOException {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int x=Integer.parseInt(br.readLine());
		for(int i=1;i<=50;i+=4) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

