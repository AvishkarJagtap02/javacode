
import java.io.*;
class Sample {
        public static void main(String args[]) throws IOException {
                InputStreamReader isr=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                System.out.println("Enter Any Year");
                int y=Integer.parseInt(br.readLine());

		if(y%4==0) {
			
			System.out.println(y+" is Leap Year");
		
		}else if(y%100==0) {
			
			System.out.println(y+" is not a Leap Year");
		
		}else if(y%400==0) {

			System.out.println(y+" is Leap Year");
		}else {

			System.out.println(y+" is not a Leap Year");
		}
	}
}





