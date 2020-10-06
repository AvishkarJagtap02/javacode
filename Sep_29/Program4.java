


class Sample {
	public static void main(String args[]) {
		char arr[]={'A','B','C','D'};
		char x='A';
		char y='A';

		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(x);
				x++;
			}
			System.out.println();
			y++;
			x=y;
		}
	}
}

