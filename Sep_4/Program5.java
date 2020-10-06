import java.util.*; 
class Sample { 

	static int MaxYr = 9999; 
	static int MinYr = 1800; 
	static boolean isLeap(int year) {  
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)); 
	}  
	static boolean isValidDate(int d,int m,int y) { 
		if (y > MaxYr || y < MinYr) 
			return false; 
		if (m < 1 || m > 12) 
			return false; 
		if (d < 1 || d > 31) 
			return false;  
		
		if (m == 2) { 
			if (isLeap(y)) 
				return (d <= 29); 
			else
				return (d <= 28); 
		} 
		if (m == 4 || m == 6 || 
			m == 9 || m == 11) 
			return (d <= 30); 

		return true; 
	} 
	public static void main(String args[]) {
	       	Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		if (isValidDate(d, m, y)) 
			System.out.println("Date is Valid"); 
		else
			System.out.println("Date Doesnt Exist!!"); 
	} 
} 



			
