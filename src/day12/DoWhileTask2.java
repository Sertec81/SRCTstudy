package day12;
import java.util.Scanner;
public class DoWhileTask2 {
    // task 1, check pin, pin should be 4 digit number
    // if it is not 4 digit number, print "incorrect pin"
   // hint: .length() -> to check length
    //ex : 13123=> "incorrect pin"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pin;
        do {
            System.out.println("Please write your pin: ");
            pin = scan.nextLine();
            if(pin.length() != 4){
                System.out.println("pin number is not correct");
            }

        }while(!pin.equals("9999"));
        System.out.println("Please take your card");




    }
}