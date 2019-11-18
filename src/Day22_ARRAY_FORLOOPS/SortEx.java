package Day22_ARRAY_FORLOOPS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortEx {
    public static void main(String[] args) {
        int[] array = {1, 15, 9, 11, 5};
        for (int n : array) {
            System.out.print(n + " ");

        }
        System.out.println();

        Arrays.sort(array);
       for ( int n:array){
           System.out.print(n + " ");  // 1 5 9 11 15
        }

        System.out.println(">--------------------------------");
        ArrayList<Integer> list = new ArrayList<>();
       list.add(5);
       list.add(7);
       list.add(10);
        System.out.println(list);  //1 5 9 11 15 >--------------------------------[5, 7, 10]
        Collections.sort(list);  ////[5, 7, 10],[5, 7, 10] collection is do left to right and right to left


        System.out.println(list);

}

    }