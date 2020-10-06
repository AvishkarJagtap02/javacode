


import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader brOne=new BufferedReader(new InputStreamReader(System.in));
	        String s1=brOne.readLine();
		BufferedReader brTwo=new BufferedReader(new InputStreamReader(System.in));
	        String s2=brTwo.readLine();
		System.out.println(s1+s2);
	
		brOne.close();
		brTwo.close();
	}
	
}	

