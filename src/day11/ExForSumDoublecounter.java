package day11;




// get avarage
public class ExForSumDoublecounter {
    public static void main(String[] args) {
//        int N = 0;
//        int sum = 0;
//        for(int x =1; x<=10; x++){
//           sum = sum + x;
//        }
//        System.out.println("sum is :" + sum);

//        int N = 0;
//        int sum = 0;
//        for (int x = 1; x <= 5; x++) {
//            sum = sum + x;
//        }
//        System.out.println("sum is :" + sum);
//
//

//        int N = 0;
//        int sum = 0;
//        for(int x =1; x<=5; x++){
//            sum = sum + x;
//        }
//        System.out.println("sum is :" + (1+2+3+4+5));
//        System.out.println("sum is :" + sum);

//        int N =0;
//        int sum = 0;
//
//        for(int i = 1; i <=3; i++){
//            System.out.println("Hi");
//        }
//        int N =0;
//        int sum =0;
//        for(int i =1; i <=6; i++){
//          sum = sum+1; // sum+ =i
//
//            System.out.println("sum is:" +sum);
//            System.out.println("Average is"+((double)sum/i));

        //       }
//        int counter = 0;
//        int sum = 0;
//        for (int i = 1; i <= 6; i++) {
//            sum = sum + i; // sum+ =i
//           System.out.println("hi");
//        counter++;
//        }
//        System.out.println(counter);

//        for(int i = 1; i <=1000; i =i*3){
//            System.out.println(i);

//        }

//        for (int i = 1; i <= 1000; i = i + 3) {
//            System.out.println(i);
//        }
//               int counter = 0;
//        for (int i = 1; i <= 1000; i = i + 3) {
//            System.out.println(i);
//            counter = counter + 1; // counter++;
//        }
//        System.out.println("counter is : " + counter);


//        }
//
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i = i + 3) {
            System.out.println(i);
            sum += i; // sum = sum +i;
            counter = counter + 1; // counter++;

            System.out.println("sum from 1 to 10 with + 3 is " + sum);
            System.out.println("counter is " + counter);
            System.out.println(sum/counter);
             System.out.println((double) sum / counter);
        }

    }
}