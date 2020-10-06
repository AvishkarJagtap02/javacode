class Sample {
	public static void main(String args[]) {
		char ch='A';
		for(int i=1;i<=5;i++) {
			char x=ch;
			for(int j=4;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
			ch++;
		}
	}
}


