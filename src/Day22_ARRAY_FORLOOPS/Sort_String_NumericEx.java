package Day22_ARRAY_FORLOOPS;
import java.util.Arrays;
public class Sort_String_NumericEx {
    // Write a java program to sort a numeric array and string array
    public static void main(String[] args) {
        int [] numbers = {1,5,7,3,};
        String[] Names = {"John", "David","Mark","Jeremy",};
//        Arrays.sort(Names);
//        System.out.println(Arrays.toString(Names));
//        System.out.println(Arrays.toString(numbers ));
//        // in arraylist we use collection.sort
        // but in arrays we use different one

         //Another way
        System.out.println("First String Array : " + Arrays.toString(Names));  // result ; First String Array : [John, David, Mark, Jeremy]
        Arrays.sort(Names);                                                     //sorted String Array : [David, Jeremy, John, Mark]
        System.out.println("sorted String Array : " + Arrays.toString(Names));


        System.out.println("First numeric Array : " + Arrays.toString(numbers));  //result :First numeric Array : [1, 5, 7, 3]
                                                                                            //  sorted numeric Array : [1, 3, 5, 7]
        Arrays.sort(numbers);
        System.out.println("sorted numeric Array : " + Arrays.toString(numbers));






    }


}
