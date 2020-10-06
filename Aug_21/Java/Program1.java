
import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Radius of the circle");
		double r=Float.parseFloat(br.readLine());
		double pi=3.14;
		double area=pi*r*r;
		System.out.println("Area Of Circle "+area);
	}
}


