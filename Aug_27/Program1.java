

import java.io.*;
class Sample {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       		int a=Integer.parseInt(br.readLine());
       		int b=Integer.parseInt(br.readLine());
		System.out.println("Addition is "+(a+b));
		System.out.println((a>b)?"Subtraction is "+(a-b):"Subtraction is "+(b-a));
	}
}
		


