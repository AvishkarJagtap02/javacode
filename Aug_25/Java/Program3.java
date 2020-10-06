
import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		if(n%2==0)
			System.out.println(n+" is an Even Number");
		else {
			System.out.println(n+" is not an Even Number");
		}
	}
}

