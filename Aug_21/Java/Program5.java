

import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       		System.out.println("Enter any charcter");
		char ch=(char)br.read();
		int ascii=ch;
		System.out.println("Ascii Value of "+ch+"is "+ascii);
	}
}	

