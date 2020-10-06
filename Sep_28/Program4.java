

import java.io.*;
class Sample {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       		System.out.println("Length of Side: ");
		int l=Integer.parseInt(br.readLine());
		System.out.println("Area= "+(l*l));
		System.out.println("Perimeter= "+(4*l));
	}
}
			

