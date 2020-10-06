
import java.io.*;
class Sample {
        public static void main(String args[]) throws IOException {
                InputStreamReader isr=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                System.out.println("Enter Marks of Physics");
                int ph=Integer.parseInt(br.readLine());
                System.out.println("Enter Marks of Chemistry");
                int cm=Integer.parseInt(br.readLine());
                System.out.println("Enter Marks of Biology");
                int bg=Integer.parseInt(br.readLine());
                System.out.println("Enter Marks of Mathematics");
                int mt=Integer.parseInt(br.readLine());
                System.out.println("Enter Marks of Computer");
                int cp=Integer.parseInt(br.readLine());
		float total=ph+cm+bg+mt+cp;
		
		float percentage=(total/500)*100;
		System.out.println(percentage);
		
		if(percentage>=90) {
			System.out.println("A");
		}else if(percentage>=80) {
			System.out.println("B");
		}else if(percentage>=70) {
			System.out.println("C");
		}else if(percentage>=60) {
			System.out.println("D");
		}else if(percentage>=40) {
			System.out.println("E");
		}else if(percentage<40){
			System.out.println("F");
		}else {
			System.out.println("F");
		}
	}
}


