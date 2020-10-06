


import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		if(a>b && a>c) {
			System.out.println("The maximum number amongst "+a+" "+b+" "+c+" is "+a);
		}else if(b>a && b>c){
			System.out.println("The maximum number amongst "+a+" "+b+" "+c+" is "+b);
		}else {
			System.out.println("The maximum number amongst "+a+" "+b+" "+c+" is "+c);
		}
	}
}
