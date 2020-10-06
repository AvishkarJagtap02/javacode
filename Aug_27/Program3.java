
import java.io.*;
class Sample {
        public static void main(String[] args) throws IOException {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int a=Integer.parseInt(br.readLine());
                int b=Integer.parseInt(br.readLine());
		int sqr1=a*a,sqr2=b*b,cube1=a*a*a,cube2=b*b*b;
		System.out.println("Addition of "+cube1+" & "+cube2+" is "+(cube1+cube2));
		System.out.println("Subtraction of "+sqr1+" & "+sqr2+" is "+(sqr1-sqr2));
	}
}
