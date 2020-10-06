

import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException { 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your age");
		int a=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Your Marital Status only in Y or N");
		char m=(char)br.read();
		br.readLine();
		
		System.out.println("Enter Gender(only Enter male for-M and Female for-F)");
		char ch=(char)br.read();


		if(ch=='F') {
			System.out.println("You can work only in Urban Areas");
		}
		else if(ch=='M') {
			if(a>=20 && a<=40) 
				System.out.println("You can Work anywhere");
		}
		else if(ch=='M') {
			if(a>=40 && a<=60) 
				System.out.println("You can Work in Urban Areas Only");
		}
		else {
				System.out.println("ERROR");
		}
	}
}

		






