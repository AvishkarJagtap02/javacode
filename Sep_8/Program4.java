



class Sample {
	public static void main(String args[]) {
		int n=0;
		for(int i=3;i>=0;i--) {
			if(i==2) { 
				 n=6;
			}
			else if(i==1) {
				 n=5;
			}
			else if(i==0){
				 n=4;
			}else {
				n=7;
			}
			for(int j=i;j<=3;j++) {
				System.out.print(n);
				n--;
			}

			System.out.println();
		}

	}
}


