
import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println("The maximum number amongst "+a+" "+b+" is "+a);
		}else {
			System.out.println("The maximum number amongst "+a+" "+b+" is "+b);
		}
	}
}
