package Day22_ARRAY_FORLOOPS;

import java.util.Arrays;


public class SumValuesArrays{
    //Write a java program to sum values of an Array
    public static void main(String[] args) {
      int[] Array ={3,4,7,9,10};
    int[] array ={1,4,9,7,3};
    for(int n: array) {
        System.out.print(n + " ");
    }
        System.out.println();

      Arrays.sort(array);
      for(int n : array){
          System.out.print(n + " ");

      }


      //   1.Way. for
        int Sum1 = 0;
        for(int number : Array) {
            Sum1 += number; // or Sum1 = Sum1 + number; sum1 = 0+3 = 3, sum1 = 3+4 =7, sum1 = 7+7 =14 Sum1 = 14+9 =23 Sum1 = 23+10= 33

        }
            System.out.println(Sum1);    //   //result =33
           System.out.println("total number is :" + Sum1);    // another way "total number is" :33

      //      2.Way .fori -> using for(int i= 0)
      int sum2 = 0;
      for(int i = 0; i<Array.length; i++){
        int number = Array[i];
        sum2+=number;

      }
        System.out.println("total number is " + sum2);




//3.Way . forr-> usinf for(int i = array.length-1), from reserve
        int sum3 = 0;
        for(int i = Array.length-1; i>=0; i--){
            int number = Array[i];
        sum3+=number;

        }
        System.out.println("total sum number is : " + sum3);




        }
}
