

import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number ");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number ");
		int b=Integer.parseInt(br.readLine());
		System.out.println("Enter the sign of operation: ");
		char ch=(char)br.read();
		switch(ch) {
			case '+':
				System.out.println("Addition of "+a+" & "+b+" is "+(a+b));
				break;
			case'-':
				System.out.println((a>b)?"Subtraction of "+a+" & "+b+" is "+(a-b):"Subtraction of "+a+ " & "+b+" is "+(b-a));
				break;
			case'*':
				System.out.println("Multiplication of "+a+" & "+b+" is "+(a*b));
				break;
			case'/':
				System.out.println((a>b)?"Division of "+a+" & "+b+" is "+(a/b):"Division of "+a+ " & " +b+" is "+(b/a));
				break;
			default:
				System.out.println("Inavlid name ");
				break;
		}
	}
}
		
		
