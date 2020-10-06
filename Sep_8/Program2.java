



import java.util.Scanner;
class Sample {
	public static void main(String args[]) {
		float rupees;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter rupees:");
		rupees = sc.nextLong();
		float dollars = rupees / 64;
		System.out.println(dollars + " Dollars");
	}
}
