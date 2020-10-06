

class Sample {
	public static void main(String[] args) {   
 
       double[] numbers ={30.5, 36.2, 25.4, 38.1, 16.8, 26.6, 17.7};
       double sum = 0;
       for(int i=0; i < numbers.length ; i++)
        sum = sum + numbers[i];
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average); 
   }
}

