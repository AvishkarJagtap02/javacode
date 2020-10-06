

class Sample {
        public static void main(String args[]) {
		int x=4;
		int y=4;
                for(int i=1;i<=4;i++) {
                        for(int j=1;j<=8;j++) {
				if(j==x || j==y)
                                	System.out.print(i);
				else
					System.out.print(" ");
					
                        }
			x--;
			y++;
                        System.out.println();
                }
        }
}

