


import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		if(((n%400==0) || (n%4==0)) && ((n!=100))) {
			System.out.println(n+" is Leap Year");
		}
		else {
			System.out.println(n+" is not Leap Year");
		}	
	}
}


