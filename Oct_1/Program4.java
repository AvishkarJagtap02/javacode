


import java.util.*;
class Sample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Overs");
		int overs=sc.nextInt();
		int total_balls=overs*6;
		int total_score=0,count6=0,count4=0,count_others=0;

		int[] runs=new int[total_balls];
		System.out.println("Enter Runs: ");
		for(int i=0;i<total_balls;i++) {
			runs[i]=sc.nextInt();
			total_score=total_score+runs[i];
			if(runs[i]==6) {
				count6++;
			}
			if(runs[i]==4) {
				count4++;
			}
			if(runs[i]==1 || runs[i]==2 || runs[i]==3) {
				count_others++;
			}
		}
		System.out.println("Total Score = "+total_score);
		System.out.println("Total balls = "+total_balls);
		System.out.println("Total Sixes = "+ count6);
		System.out.println("Total fours = "+ count4);
		System.out.println("Total no of others = "+ count_others);
	}
}




