package day23_Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Task7 {
    private static Character[] letterList;
    // Given arrayList of chars
    // print true if they have repetitive letters
    // {'A','B','B'} => true
    // {'C','D'} => false

    ArrayList<Character> letterlist = new ArrayList<>();
 //       letterList.add('C');

    //        letterList.add('D');
//        letterList.add('e');
//        letterList.add('D');
//        letterList.add('B');
    public static void main(String[] args){
            // 1way. sets
            HashSet<Character> letterSet = new HashSet<>();
            for (Character letter : letterList) {
                letterSet.add(letter);
            }

            System.out.println(letterList);
            System.out.println(letterSet);
    //        if (letterList.size() != letterSet.size()) {
                System.out.println("we have repetition: " + true);
//            } else {
                System.out.println("we dont have repetition: " + false);
            }

            // 2way. nested loop
            // 3way. indexes


    }
