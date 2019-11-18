package Day22_ARRAY_FORLOOPS;

import java.util.ArrayList;

public class RemoveandRetainArraylist {
    public static <Arraylist> void main(String[] args) {
        // array
//        int[] array = new int[10];
//     array[9] = 1000;
//      array[10] =2000;

//        char[] ca   = new char[10];
//        String[] sa = new String[10];
//        //       Example[] ea = new Example[10];
//        int length = array.length;

        //Arraylist
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(1000);
//        list1.contains(100);
//
//        ArrayList<Character>list2 = new ArrayList<>();
//        list2.add('A'); // ADD ELEMENT
//        list2.size();  // GIVES LENGTH
//        list2.clear(); // clear your arrayList
 //       list2.remove( 'A');
 //       list2.get(0);
//        list2.isEmpty();  // checks if arrayList is empty
//        list2.contains('B');

//        ArrayList<String> list3 = new ArrayList<>();
//        list3.add("Apple");
//        list3.add("lemon");
//        list3.add("peach");
//       System.out.println(list3);
//        ArrayList<String> list4 = new ArrayList<>();
//        list4.add("lemon");
//        list4.add("peach");
//        list4.add("cherry");
//        list4.removeAll(list3);
//       System.out.println(list4);

//       ArrayList<String> list3 = new ArrayList<>();
//       list3.add("Apple");
//       list3.add("lemon");
//       list3.add("peach");
//       list3.set(0, "berry");          // when uptade always use "set"
//       System.out.println(list3);   // update apple with berry



  //    ArrayList<String> list3 = new ArrayList<>();
//       list3.add("Apple");
//       list3.add("lemon");
//       list3.add("peach");
//       list3.add(1, "berry");
//       System.out.println(list3);              // if index =1 berry comes after apple, [Apple, berry, lemon, peach]


//       ArrayList<String> list3 = new ArrayList<>();
//        list3.add("Apple");
//        list3.add("lemon");
//        list3.add("peach");
//
//        ArrayList<String>list4 = new ArrayList<>();
//       list4.add("lemon");
//       list4.add("peach");
//
//        list3.retainAll(list4);
//       System.out.println(list3);

//        ArrayList<String>list3 = new ArrayList<>();
//        list3.add("dog");
//        list3.add("cat");
//        list3.add("bird");
//        list3.add(1,"snake");
//        System.out.println(list3);

//      ArrayList<String>list5 = new ArrayList<>();
//      list5.add("toyota");
//      list5.add("honda");
//      list5.add("chevy");
//      list5.add("ford");
//      list5.add(2,"fiat");
//        System.out.println(list5);


//       ArrayList<String> list3 = new ArrayList<>();
//        list3.add("Apple");
//        list3.add("lemon");
//        list3.add("peach");
//
//        ArrayList<String>list4 = new ArrayList<>();
//       list4.add("lemon");
//       list4.add("peach");
//
//        list3.retainAll(list4);
//       System.out.println(list3);

        ArrayList<String>list6 = new ArrayList<>();
        list6.add("6");
        list6.add("5");
        list6.add("4");
        list6.add("3");
        list6.add("2");
        list6.add("1");
        System.out.println(list6);

        ArrayList<String>list7 = new ArrayList<>();
        list7.add("0");
        list7.add("7");
        list7.add("3");
        list7.add("2");
  //  list7.removeAll(list6);
   //     System.out.println(list7);
      //  list6.removeAll(list7);
    //    System.out.println(list6);
//        list7.removeAll(list6);   //[6, 5, 4, 3, 2, 1]
//        System.out.println(list7); //[0, 7]
//         list6.retainAll(list7); //[6, 5, 4, 3, 2, 1]
//        System.out.println(list6); //[3, 2]

//        list7.retainAll(list6); //[6, 5, 4, 3, 2, 1]
//        System.out.println(list7); // [3, 2]

        list7.removeAll(list6);  //   [6, 5, 4, 3, 2, 1]
        System.out.println(list7); // [0, 7]


    }


    }