

import java.io.*;
class Sample {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Min of series");
		int min=Integer.parseInt(br.readLine());
		
		System.out.println("Max of series");
		int max=Integer.parseInt(br.readLine());
		System.out.print("Series Of Odd Number Ranging between "+min+" & "+max+" : ");
		for(int i=min;i<=max;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
			
