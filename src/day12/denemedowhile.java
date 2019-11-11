package day12;
import java.util.Scanner;
public class denemedowhile {
    public static void main(String[] args) {
        // task 1, check pin, pin should be 4 digit number
        // if it is not 4 digit number, print "incorrect pin"
        // hint: 999 < PIN < 10000
        // ex: 13123 => "incorrect pin"

        Scanner scan = new Scanner(System.in);
       int pin;
        do {
                // if(statement)
                // print "incorrect pin"
            System.out.println("Please write a Pin");
            pin = scan.nextInt();
            if (pin <= 999 || 10000 <= pin) {
                System.out.println("Please use 4 digit number");
            }
        }while(pin != 9999);
        System.out.println("take your card");






    }

}


