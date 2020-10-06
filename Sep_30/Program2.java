


class Sample {
	public static void main(String[] args) {
		int[] my_array1={25,14,56,15,36,56,77,18,29,49};
		boolean flag1=false;
		boolean flag2=false;
		int x=0;
		int y=0;
		for(int i=0;i<my_array1.length;i++) {
			if(25==my_array1[i]) {
				flag1=true;
				x=i;
			}			
			if(77==my_array1[i]) {
				flag2=true;
				y=i;
			}
		}
		if(flag1==true) {
				System.out.println("25 is available on"+x+" position in array");
		}
		if(flag2==true) {
				System.out.println("77 is available on"+y+"position of  array");
		}
	}
}



