


class Sample {
	public static void main(String args[]) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
			
				if(i==1 || i==5 || j==1 || j==5)	
					System.out.print("3 ");
				else if(i==2 || j==4 || j==2 || i==4) 
					System.out.print("2 ");
				else 
					System.out.print("1 ");
			}
			System.out.println();

		}
	}
}


/*
  3 3 3 3 3
  3 2 2 2 3 
  3 2 1 2 3
  3 2 2 2 3 
  3 3 3 3 3
  */
