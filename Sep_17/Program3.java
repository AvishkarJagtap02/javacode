

class Sample {
	public static void main(String args[]) {
		int x=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==2 || i==3 || i==4) {
						j=j+3;
						System.out.print(x+" ");
				}else {
					System.out.print(x+" ");
				}
			}
			System.out.println();
			x++;
		}
	}
}

