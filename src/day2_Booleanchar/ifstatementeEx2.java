package day2_Booleanchar;

public class ifstatementeEx2 {
    public static void main(String[] args) {
        // 1. write a program that checks whether number
        //      is positive or negative
        // ex: 1 => positive
        // ex: -100 => negative
        // hint: N > 0 => positive, N < 0 => negative

        int number = 10;
        if (number > 0) {
            System.out.println("number is pozitive");
        }
        if (number < 0) {
            System.out.println("number is negative");
        }
        if (number == 0) {
            System.out.println("not pozitive neither negative");
        }

        // 2. write a program that check whether number
        // is even or odd
        //  // ex: 2 => even
        // ex: 3 => odd
        int num = 3;
        if (num % 2 == 0) {
            System.out.println("even");
        }
        if (num % 2 != 0) {
            System.out.println("odd");
        }
        if (3 != 10) {
            System.out.println("3  is not equal to 10");
        }

//        int a1 = 100;
//        int a2 = 2;
//        int a3 = 3;
//        int result = 0; // 0
//        if (result < a1) { // 0<100
//            result = a1; // 100
//        }
//        if (result < a2) {
//            result = a2;
//        }
//        if (result < a3) {
//            result = a3;
//        }
//        System.out.println("the result number is " + result);
        int a1 = 20;
        int a2 = 10;
        int a3 = 5;
        int result = 7;
        if (result < a1) {
            result = a1;
        }
        if (result < a2) {
            result = a2;
        }
        if (result > a3) {
            result = 7;
        }
        System.out.println("the result number is " +  result);

    }
}