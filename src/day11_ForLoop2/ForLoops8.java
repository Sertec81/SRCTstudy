package day11_ForLoop2;

public class ForLoops8 {

    public static void main(String[] args) {
        for(int i =1; i <= 100; i++) {
            System.out.println(i);
            if (i == 15) {
                break;
            }
        }

            System.out.println("End");

        for(int i = Integer.MAX_VALUE;  ;i++) {
           System.out.println(i);
            break;
        }
        System.out.println("End");

    }



}
