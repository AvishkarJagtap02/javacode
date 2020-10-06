

class Sample {
	public static void main(String[] args) {
		int x=1,y=1,z=4;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("\t");
			}
			for(int k=5;k>=i;k--) {
				System.out.print((x*y)+"\t");
				x++;
			}
			System.out.println();
			y++;
			x=x-z;
			z--;
		}
	}
}
