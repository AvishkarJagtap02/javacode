

import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Distance:");
		int d=sc.nextInt();
		System.out.println("Time:");
		int t=sc.nextInt();
		int v=d/t;
		System.out.println("The velocity of a particle roaming in space is: "+v+"m/s");
	}
}

