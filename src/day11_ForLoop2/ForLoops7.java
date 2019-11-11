package day11_ForLoop2;

public class ForLoops7 {
    public static void main(String[] args) {

        System.out.println("Example with multiple declarations, initialiazizations and uptade expression");
        for (int i = 0, j = 1, k = 2; i <= 10 && j <= 11 && k <= 12; i++, j = j + 2, k = j + 3) {
            System.out.print(" i = " + i);                         //i=0, j=1, k=2;
            System.out.print(" j =  " + j);                          //i =1, j =3, k= 6;
            System.out.print(" k = " + k);                            //2, j=5, k= 8;
            System.out.println();                                    // i =3, j=7, k =10;
        }                                                           //  i =4, j=9, k=12;

             for (int i = 1, j = 2; i <= 10 && j < 5; i++, j++) { // i++ =i=i+1, j++ =j j+1
                System.out.println(i * j);
               }
                // i = 1, j = 2
                // i = 2, j = 3
                // i = 3, j = 4
                // i = 4, j = 5 this condition is not true because j is not equal to 5

        }
}

