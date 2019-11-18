package Day22_ARRAY_FORLOOPS;

public class Example2 {
    public static void main(String[] args) {
      String s1 = " Hello world";
     //   s1.charAt(0); it s gonna result "H"
      //System.out.println(s1.charAt(0));  //=H
      //System.out.println(s1.charAt(4));  // O

        char c = s1.charAt(0);
        Character c1 = s1.charAt(0);

        int length = s1.length();
        System.out.println(length);



        System.out.println(s1.charAt(6)); // W
        System.out.println(s1.length());   //  gives Length of your string  total character 21
        System.out.println(s1);   //  gives only 123Hello World123 123
     // System.out.println(s1.trim());  //  trim removes spaces before and after but it is not remove between

        String trimmedS1 = s1.trim();
        System.out.println(trimmedS1);   // leading means before, trailing means after



}
}