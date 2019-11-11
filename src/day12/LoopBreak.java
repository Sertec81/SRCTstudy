package day12;

public class LoopBreak {
    public static void main(String[] args) {
        int number =0;
        for (int i =1 ; i<=10; i++ ){
            System.out.println(i);
            if(i == 5){
               number =i;
                break;

            }
        }
        System.out.println("your number is: " + number);
//      run Loop up to 100000000,
//        and exit that Loop when is i is equal to 232558
    }

}
