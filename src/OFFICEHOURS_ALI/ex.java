package OFFICEHOURS_ALI;
 import java.util.ArrayList;
public class ex {

    public static void main(String[] args) {


        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Lion");
        list3.add("Dog");
        list3.add("Tiger");
        list3.add("Cat");
        list3.add("Lizard");
        list3.add("Elephant");
        list3.add("Cow");


        ArrayList<String> list4 = new ArrayList<>();

        list4.add("Lion");
        list4.add("Elephant");
        list4.add("Bird");
        list4.add("Tiger");
        list4.add("Zebra");
        list4.add("Lizard");
        list4.add("Dog");

//      please make sure list 3 contains list 4

   //     ArrayList<String> list3 = new ArrayList<>();

        list3.add("Lion");
        list3.add("Dog");
        list3.add("Tiger");
        list3.add("Cat");
        list3.add("Lizard");
        list3.add("Elephant");
        list3.add("Cow");


 //       ArrayList<String> list4 = new ArrayList<>();

        list4.add("Lion");
        list4.add("Elephant");
        list4.add("Bird");
        list4.add("Tiger");
        list4.add("Zebra");
        list4.add("Lizard");
        list4.add("Dog");

//      please make sure list 3 contains list 4

        // WAY 1.
        boolean check = false;
        for (int i = 0; i < list3.size(); i++) {
            for (int j = 0; j < list4.size(); j++) {

                if (list3.get(i).equals(list4.get(j))) {
                    check = true;
                } else {
                    check = false;
                    break;

                }
            }

            System.out.println("my result is:------" + check);

        }

        // WAY 2
        boolean contains = false;
        for (int i = 0; i < list3.size(); i++) {
            for (int j = 0; j < list4.size(); j++) {
                if (list3.get(i).contains(list4.get(j))) {
                    contains = true;
                } else {
                    contains = false;
                    break;
                }
                System.out.println(contains);
            }
        }
    }
    }