package day14_ArrayForloops;

public class findminuminArray {
    public static void main(String[] args) {
        int[] myArray = {34, 2, 11, 45, 9, 56};
        // 0   1   2   3  4
        int min = myArray[4];
        for (int i = 0; i < myArray.length; i++) {

//            System.out.println(myArray[i]);
            //min = 34;
            // 34<34, min = 34
            // 2<34, min = 2
            //11<2, min = 2
            if (myArray[i] < min){
                min = myArray[i];

            }

        }
        System.out.println(min);
    }
}
