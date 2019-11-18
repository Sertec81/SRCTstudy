package Day22_ARRAY_FORLOOPS;


public class CharArray {
    public static void main(String[] args) {
        String s1= "Hello";
   //     char[]charArray = new char[s1.length()];  // char[] charArray = new char[s1.Length()];
        // way1
//        charArray[0] =    'H';
//        charArray[1] =    'e';
//        charArray[2] =     'l';
//        charArray[3] =     'l';
//        charArray[4] =     'o';

//        char[] charArray = s1.toCharArray();
//        charArray[0] = 'A';
//        System.out.println(s1);
//        System.out.println(charArray);

//    char[] charArray = s1.toCharArray();
//    charArray[3] = 'b';
//        System.out.println(s1);
//        System.out.println(charArray);


//    char[]charArray = s1.toCharArray();
//    charArray[4] = 'e';
//        System.out.println(s1);
//        System.out.println(charArray);

        char[] charArray = s1.toCharArray();
        charArray[0] = 'K';
        System.out.println(s1);
        System.out.println(charArray);
}
}