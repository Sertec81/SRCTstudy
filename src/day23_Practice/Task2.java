package day23_Practice;

public class Task2 {
    // write a java program that find maximum
    // of three numbers
    public static void main(String[] args) {
//        int a = 12;
//        int b = 24;
//        int c = 50;
//        int ab = Math.max(a, b);
//        if (ab > c) {
//            System.out.println("max is:" + ab);
//        } else {
//            System.out.println("max is:" + c);
//        }
     // 2 way
        int a = 34;
        int b = 45;
        int c = 78;

        if(a>=b){
            if(a>= c)
                System.out.println(a + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        }
        else {
            if(b >= c)
                System.out.println(b + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        }




    }
    }


