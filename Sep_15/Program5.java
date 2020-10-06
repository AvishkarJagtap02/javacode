

class Sample {
	public static void main(String[] args) {
		int x=1,y=10,z=3;
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=y;j+=2) {
				System.out.print(x+"\t");
				x++;	
			}
			System.out.println();
			x=z;
			z+=2;
			y--;
		}
	}
}

