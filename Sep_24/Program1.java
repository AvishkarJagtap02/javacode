
import java.util.*;
import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sDetail=br.readLine();
		StringTokenizer st=new StringTokenizer(sDetail," ");
		String token1=(st.nextToken()).trim();
		String token2=(st.nextToken()).trim();
		String token3=(st.nextToken()).trim();
		String token4=(st.nextToken()).trim();


		System.out.println("sname :"+token1);
		System.out.println("grade: "+token2);
		System.out.println("age: "+token3);
		System.out.println("marks: "+token4);
	}
}

