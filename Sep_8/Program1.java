
import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=100;) {
			System.out.print(i+" ");
			i=i+n;
		}
		System.out.println();
	}
}

