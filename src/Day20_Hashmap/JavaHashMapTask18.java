package Day20_Hashmap;
import java.util.HashSet;
import java.util.HashMap;

public class JavaHashMapTask18 {

    public static void main(String[] args) {



    //17. Count letters in string
    //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"
    //part 1
    // print every character in separate line
    String sentence = "BECOME A SOFTWARE TESTER IN 6 MONTHS";
        System.out.println("1. way");



    // for ex:
    // A: 2
    // B: 1
    // ...


    //part2
    // put every character in HashSet
        HashSet<Character> mySet = new HashSet<>();
        for(int i= 0; i<sentence.length(); i++) {
            char aChar = sentence.charAt(i);
            mySet.add(aChar);
        }
            System.out.println(mySet);

        //part3
    // put every character in HashMap<Character, Integer>
        HashMap<Character,Integer> myMap=new HashMap<>();
        for(int i=0; i<sentence.length();i++) {
            char aChar = sentence.charAt(i);
            myMap.put(aChar, 0);
        }
        System.out.println(myMap);



    //part4
    // when you are putting check if you have that letter already, if you have, increment value

    //part5
    //print HashMap


        //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"
        //part 1
        // print every character in separate line
    }
}