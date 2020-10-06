

import java.io.*;
class Sample {
   public static void main(String args[]) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int x=Integer.parseInt(br.readLine());
	int y=Integer.parseInt(br.readLine());
	for (int i = x; i <= y; i++) {
        	System.out.println(" Factorial of "+ i+" is " +factorial(i));
        }
   }
   public static int factorial(int n) {
   	if (n <= 1) 
	      return 1;
        else 
	      return n * factorial(n - 1);
   }
}




