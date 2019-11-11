package day23_Practice;

public class Task3 {
    public static void main(String[] args) {
        //    Write a Java program to find the largest element in an array.
        // {1,34,66,1000,23,4,7,9} => 1000


        int [] num= {5,90,6,8,23,55}; // also as a tester always try negative like int[} num = {-10, -10- -100....}
        int min=Integer.MAX_VALUE;      // int min = Integer.MIN_VALUE

        for(int i=0; i<num.length;i++) {

            if(num[i]<min) {
                min=num[i];
            }
        }
        System.out.println("The smallest number is: "+ min);





    }
}
