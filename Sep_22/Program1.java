

import java.io.*;
class IPLTeam {
	String s1="MI";
	String s2="Rohit Sharma";
	int n1=45;
	String s3="mukesh ambani";
	int n2=4;


	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		IPLTeam tn=new IPLTeam();
		System.out.println("Enter Team Name: "+tn.s1);
		System.out.println("Enter Captain Name: "+tn.s2);
		System.out.println("Enter Jersey Number of "+tn.s2+ ": " +tn.n1);
		System.out.println("Enter Franchise owner Name "+tn.s3);
		System.out.println("Enter Team Name "+tn.s3);
		System.out.println("Enter Count of trophies won: "+tn.n2);
	}
}
