

import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int p=0,n=0,e=0,o=0,z=0;
		for(int i=1;i<10;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>0)
				p++;
			if(arr[i]<0)
				n++;
			if(arr[i]%2==0)
				e++;
			if(arr[i]%2!=0)
				o++;
			if(arr[i]==0)
				z++;
		}
		System.out.println("Number of array elements are positive is "+p);
		System.out.println("Number of array elements are negative is "+n);
		System.out.println("Number of array elements are even is "+e);
		System.out.println("Number of array elements are odd is "+o);
		System.out.println("Number of array elements are zero is "+z);
	}
}


