


class Sample {
	public static void main(String args[]) {
		for(int i=4;i>=1;i--) {
			char ch='A';
			for(int j=4;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}

