

import java.util.Scanner;
class Sample {
    public static void main(String[] args) {
        int max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of students :");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter age of students:");
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum age:"+max);
    }
}

