package day11_ForLoop2;
import java.util.Scanner;
public class ForTask3 {
    public static void main(String[] args) {
        // part 1
// Write a program with sum up to you provided number from 0
// 5
// 0+1+2+3+4+5= > ???
// part 2
 // continue part 1, and get average

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a max number: ");
        int max = scan.nextInt();
        int sum = 0;
        int counter= 0;
        for(int i = 0; i <= max; i++ ){
            System.out.println(i);
        sum+=i;  //sum = sum +i
        counter++;
      }
        System.out.println("sum is " + sum);
        //part2 is to get Average
        System.out.println("average is" + ((double)sum/counter));

    }
}





