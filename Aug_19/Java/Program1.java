import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter any Charachter");
		char ch=(char)br.read();
		if(ch>='a' && ch<='z') {
		       System.out.println(ch+" is in Lowercase");
		}else {
		       System.out.println(ch+" is in Uppercase");
		}
	}
}	
	
 		
		

