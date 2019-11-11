package day14_ArrayForloops;

public class ArrayForLoops4 {
    public static void main(String[] args) {
        int[] arr = {2, 11, 45, 9};

        for (int num : arr) {
            System.out.println(num); //formula 1
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {  // formula 2
            System.out.println(arr[i]);
        }
    }
}
