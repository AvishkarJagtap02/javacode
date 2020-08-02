

import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i!=1) {
			System.out.println("You are in the while loop");
			System.out.println("Press 1 to exit the while loop");
			i=sc.nextInt();
		}
		System.out.println("You are out of while loop");
	}
}


