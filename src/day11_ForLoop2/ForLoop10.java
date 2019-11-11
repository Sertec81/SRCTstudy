package day11_ForLoop2;

public class ForLoop10 {
    public static void main(String[] args) {
        // this will cause error;
        // int x;

       //  redeclaring x as long will not work
//        for (long x = 0, x = 1; x < 5; x++){
//            System.out.print(x + " ");
//        }
//        System.out.println();
//        int x = 10;
//        System.out.println("x is :" + x);

        int N = 0;
        for(int x= 0; x < 3; x++){
            System.out.println(x +"");
            N = x;
        }
        System.out.println("N is :" + N);
    }


        }




