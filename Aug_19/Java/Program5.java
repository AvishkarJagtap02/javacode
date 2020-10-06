
import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter 3 angles of triangle");
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
		int z=Integer.parseInt(br.readLine());
		
		if(x+y+z==180) {
			System.out.println("The triangle with "+x+" "+y+" "+z+"is  Valid ");
		}
		else {
			System.out.println("The triangle with "+x+" "+y+" "+z+"is a  InValid one");
		}
	}
}

