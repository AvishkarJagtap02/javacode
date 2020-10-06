

import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
	        InputStreamReader isr=new InputStreamReader(System.in);
       	        BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Principal Amount");
		int p=Integer.parseInt(br.readLine());
		System.out.println("Enter Rate per Annum");
		int r=Integer.parseInt(br.readLine());
		System.out.println("Enter Number of Years");
		int n=Integer.parseInt(br.readLine());
		int SI=p*r*n/100;
		
		System.out.println("Simple Interest = "+SI+" INR");
	}
}
			
				

