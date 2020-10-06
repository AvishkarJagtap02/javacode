
import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the two sides and hypothenius of the triangle");
		int s1=Integer.parseInt(br.readLine());
		int s2=Integer.parseInt(br.readLine());
		int h=Integer.parseInt(br.readLine());
		if((s1*s1)+(s2*s2)==(h*h)) {
			System.out.println("Triangle Satisfies The Pythagoras Theorem");
		}else {
			System.out.println("Triangle cannot Satisfies The Pythagoras Theorem");
		}
	}
}



