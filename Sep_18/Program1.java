import java.io.*;
class Sample {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("choice : 1-int , 2-String");
		int x=Integer.parseInt(br.readLine());
		switch(x) {
			case 1:
				int i=Integer.parseInt(br.readLine());
				System.out.println(i);
				break;
			case 2:
				String j=br.readLine();
				System.out.println(j);
				break;
			default:
				break;
		}
	}
}

