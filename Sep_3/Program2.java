

import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int j=1;
		for(int i=a;i<=b;i++) {
			int fact=1;
			for( j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.println("Factorial of "+i+" is "+fact);
		}
	}
	
}


