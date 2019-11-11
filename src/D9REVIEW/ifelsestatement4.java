package D9REVIEW;

public class ifelsestatement4 {
    public static void main(String[] args) {

        int num = 123;

        if (num < 9 && num >= 1) {

            System.out.println("Its a one digit number");

        } else if (num < 99 && num >= 9) {

            System.out.println("Its a two digit number");

        } else if (num < 999 && num >= 99) {

            System.out.println("Its a three digit number");

        } else if (num < 9999 && num >= 999) {

            System.out.println("Its a four digit number");

        } else {
            System.out.println("number is not between 1 & 9999");

        }





    }

}
