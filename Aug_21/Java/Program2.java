


import java.util.*;
class Sample {
         public static void main(String args[]) {

                Scanner sc= new Scanner(System.in) ;

                System.out.println("Enter electricity units:");

                int u = sc.nextInt();

                float rate , bill;

                if(u >= 0 && u <= 50)
                                rate=0.50f;
                else if(u >= 50 && u <= 150)
                                rate=0.75f;
                else if(u >= 150 && u <= 250)
                                rate =1.20f;
                else
                                rate=1.50f;

                        bill = u * rate ;

                        System.out.println("Total electricity bill is :" +bill +" Rs");

                }
        }

