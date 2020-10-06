
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

		String token5=(st.nextToken()).trim();
		String token6=(st.nextToken()).trim();
		String token7=(st.nextToken()).trim();
		String token8=(st.nextToken()).trim();
		
		String token9=(st.nextToken()).trim();
		String token10=(st.nextToken()).trim();
		String token11=(st.nextToken()).trim();
		String token12=(st.nextToken()).trim();

		System.out.println("-----------------------------------------------------");
		System.out.println("student1 name :"+token1);
		System.out.println("student1 grade: "+token2);
		System.out.println("student1 age: "+token3);
		System.out.println("student1 marks: "+token4);
		System.out.println("-----------------------------------------------------");
		
		System.out.println("student2 name :"+token5);
		System.out.println("student2 grade: "+token6);
		System.out.println("student2 age: "+token7);
		System.out.println("student2 marks: "+token8);
		System.out.println("-----------------------------------------------------");
		
		System.out.println("student3 name :"+token5);
		System.out.println("student3 grade: "+token6);
		System.out.println("student3 age: "+token7);
		System.out.println("student3 marks: "+token8);
		System.out.println("-----------------------------------------------------");
	}
	
}

