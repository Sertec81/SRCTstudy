package day12;
import java.util.Scanner;
public class DowhileEx1 {


    public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//
//            int pin = 0;
//            do {
//                System.out.println("WRITE YOUR PIN:");
//                pin = scan.nextInt();
//            }while (pin != 9999);    // == sign -> equal  // != sign -> not equal
//
//            System.out.println("Take you card");

        Scanner scan = new Scanner(System.in);
        int pin = 10;                                       // do while do something at least one time
        do {
            System.out.println("Write a pin number");
            pin = scan.nextInt();
        } while (pin != 1000) ;

        System.out.println("take out your card");




    }

}





