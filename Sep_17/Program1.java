


class Sample {
	public static void main(String args[]) {
		int y=0;
		for(int i=1;i<=5;i++) {
			int x=1;
			x=x+y;
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
				x--;
			}
			System.out.println();
			y++;
			
		}
	}
}





