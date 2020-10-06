class Sample {
	public static void main(String args[]) {
		for(int i=1;i<=5;i++) {
			int x=0;
			for(int j=4;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				if(x>1)
					x=0;
				System.out.print(x+" ");
				x++;
			}
			System.out.println();

		}
	}
}


