package Day22_ARRAY_FORLOOPS;

public class splitMethodEx {
    public static void main(String[] args) {
        String  s1 = "https://amazon.com/item/2837847/edit";
        String[] array = s1.split("/");
        for(String s : array){
            System.out.println(s);

        }
  //  System.out.println("Numbers : " + array[array.length - 2]);  // way 1
     //   System.out.println( array[array.length - 4]);  // another way
        System.out.println("Numbers:" + array[array.length - 3]);
//        System.out.println(array[5]);   // way 2
//        System.out.println(array[2]);
//        System.out.println(array[3]);



    }

}
