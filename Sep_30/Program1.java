


class Sample {
	public static void main(String[] args) {
		int[] my_array1={1789,2035,1899,2013,1458,2458,1254,1472,2365};
		boolean flag1=false;
		boolean flag2=false;
		for(int i=0;i<my_array1.length;i++) {
			if(2013==my_array1[i]) {
				flag1=true;
			}			
			if(2015==my_array1[i]) {
				flag2=true;
			}
		}
		if(flag1==true) {
				System.out.println("2013 is available in array");
		}else {
				System.out.println("2013 is not available in array");
		}
		if(flag2==true) {
				System.out.println("2015 is available in array");
		}else {
				System.out.println("2015 is not available in array");
		}
	}
}



