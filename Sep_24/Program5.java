
import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String del=" ";
		for(int i=1;i<=4;i++) {
			String str=sc.nextLine();

			if(i==1)
				del=" ";
			else if(i==2)
				del=",";
			else if(i==3)
				del=":";
			else 
				del="-";
			StringTokenizer st=new StringTokenizer(str,del);	
			System.out.println("----------------------------------------------");
					System.out.println("Number of Tokens: "+st.countTokens());

			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken(del));
			}	
			System.out.println("----------------------------------------------");
		}
	}	
}

