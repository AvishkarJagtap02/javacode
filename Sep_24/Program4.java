
import java.util.*;
class Sample {
	public static void main(String args[]) {
		String one = "SWARUP,A,2,324.2";
		String two = "SONIA,C,23,522.05";
		StringTokenizer st=new StringTokenizer(one,",");
		System.out.println(" tokens ="+st.countTokens());
		
		for(int i=1;i<=4;i++) {
			System.out.println(st.nextToken());
		}
		StringTokenizer st2=new StringTokenizer(two,",");
		System.out.println(" tokens ="+st2.countTokens());
		while(st2.hasMoreTokens()==true) {
			System.out.println(st2.nextToken());
		}

	}
	
}

