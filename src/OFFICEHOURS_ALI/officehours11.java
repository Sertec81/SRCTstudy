package OFFICEHOURS_ALI;
import java.util.ArrayList;
public class officehours11 {
    public static void main(String[] args) {
        //   break       vs       continue
        /*
We are using break and continue in the for loop
 */

        //       when the for loop hit the break it stop the for loop

        //      When the for loop hit the continue it pass that step in the for loop

        //  */

// example of the BREAK
        for (int i = 0; i < 100; i++) {


            if (i == 50) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am after the for loop ");

        System.out.println("-------------------------------------");

//  example of the CONTINUE

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                continue;

            }

            System.out.println(i);

        }


//        verify first array equal to  second array

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Lion");
        list1.add("Tiger");
        list1.add("Elephant");
        list1.add("Cow");
        System.out.println();

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Lion");
        list2.add("Tiger");
        list2.add("Cat");
        list2.add("Cow");

//        first use for loop and then use the if statement

        System.out.println("---------------------------");

        boolean result = true;

        for (int i = 0; i < list1.size(); i++) {

            System.out.println("list 1 is here  -->>  " + list1.get(i));
            System.out.println("list 2 is here  -->>  " + list2.get(i));

            if (list1.get(i).equals(list2.get(i))) {

                result = true;
            } else {

                result = false;
            }

        }

        System.out.println("my result is --->> " + result);
      //  another way Ali

        boolean check = false;

   //     for(int i = 0 ; i < list3.size();  i++){

        //    for(int j =0 ; j<list4.size() ; j++){

            //    if(list3.get(i).contains(list4.get(j))){

                    check = true;

              //      break;
              //  }else{

                //    check = false;


                }



            }

       //     if(check==false){

           //     break;
        //    }

   //     }

    //    System.out.println("Check is here ---->>>>   "+check);



 //   }
//}
