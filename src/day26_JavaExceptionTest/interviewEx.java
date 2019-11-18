package day26_JavaExceptionTest;

public class interviewEx {

     //   When you divide a number by 10, you get rid of the last digit,
      //      for example, 211/10 will give you 21, and 21/10 will give you 2,
     //   so you got rid of last 2 digits by dividing your number by 10 twice.
     public static void main(String[] args) {
         int num= 1534236469, reversed = 0;
         while (num != 0){
         int digit = num % 10;
         reversed = reversed* 10 + digit;
            num/= 10;
     }
        System.out.println("Reversed number is : " + reversed);
}
    }