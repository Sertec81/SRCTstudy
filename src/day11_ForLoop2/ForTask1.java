package day11_ForLoop2;
    import java.util.Scanner;
//Task 1 write a program that takes "a: and "b" numbers
// from console, and show multipication up to that "a" number
// Ex: a = 3, b = 2
//      2=> 2*1
//      4=> 2*2
//      6=> 2*3
//  Hint: use homeworkLoops and exercise above


public class ForTask1 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.println("Provide a : ");
        int a = scan.nextInt();
        System.out.println("provide b :");
        int b = scan.nextInt();
        for(int i =1; i<= a; i++){
           // i = 1, a =3
            System.out.println(i*b);
        }
    }
}
