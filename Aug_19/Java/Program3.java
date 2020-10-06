

import java.io.*;
class Sample {
        public static void main(String[] args) throws IOException {
                InputStreamReader isr=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                System.out.println("Enter any Month number from 0 to 12");
                int n=Integer.parseInt(br.readLine());
                switch(n) {
                        
                        case 1:
                                System.out.println("January is a 31 Day's Month");
                                break;
                        case 2:
                                System.out.println("February is 28 Day's in common years and 29 in Leap Years");
                                break;
                        case 3:
                                System.out.println("March is 31 Day's Month");
                                break;
                        case 4:
                                System.out.println("April is 30 Day's Month");
                                break;
                        case 5:
                                System.out.println("May is 31 Day's Month");
                                break;
                        case 6:
                                System.out.println("June is 30 Day's Month");
                                break;
                        case 7:
                                System.out.println("July is 31 Day's Month");
                                break;
                        case 8:
                                System.out.println("August is 31 Day's Month");
                                break;
                        case 9:
                                System.out.println("September is 30 Day's Month");
                                break;
                        case 10:
                                System.out.println("October is 31 Day's Month");
                                break;
                        case 11:
                                System.out.println("November is 30 Day's Month");
                                break;
                        case 12:
                                System.out.println("December is 31 Day's Month");
                                break;
                        default:
                                System.out.println("Enter Valid Number");
                                break;
                }
        }
}

