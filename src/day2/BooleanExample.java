package day2;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bool = true;
        boolean bool2 = false;

        int number = -10;
        boolean isBiggerThan10 = number > 10;
        System.out.println("number >10:" + isBiggerThan10);
        boolean isSmallerThan10 = number < 10;
        System.out.println("number <10:" + isSmallerThan10);
//            20 > 10 : true
        int Number = 20;
        boolean isBiggerThan11 = Number > 11;
        System.out.println(Number + "> 10:" + isBiggerThan11);



        boolean falseBool = false;
        boolean trueBool  = true;

        // 1. write program wchich will test this :
        //a.true && true => true
        System.out.println(trueBool && trueBool);

        //b. false && true => false
        System.out.println(falseBool && trueBool);

        //c. true && false+ => false
        System.out.println(trueBool && falseBool);
        //d. false && false => false
        System.out.println(falseBool && falseBool);


//             &&, Logical  AND : return true when both conditions are true.
//          ||, Logical OR :returns true if at least one condition is true.

        System.out.println("true && true =>" + (trueBool && trueBool));
        System.out.println("true && true=>"+ (falseBool && trueBool));
        System.out.println("true && true =>"+(trueBool && falseBool));
        System.out.println("true && true =>"+ (falseBool && falseBool));

//      Logical OR :returns true if at least one condition is true.
//      Logical sign Or JAVA is => ||

        // 2. write program which will test this:
        // a.true || true => ?
        // b. false || true =>?
        // c. true || false => ?
        //d. false || false => ?

        System.out.println("true || true =>" +(trueBool|| trueBool));
        System.out.println("false || true =>" + (falseBool || trueBool));
        System.out.println("true || false =>"+ (trueBool || falseBool));
        System.out.println("false || false =>"+(falseBool || falseBool));

        System.out.println(true && false || false && false);

//   system.out.println(true&& true || false && false); =>true
//   system.out.println( true && (true||false)&& (false|| true) && true ||false|| true|| false); => true

        //        System.out.println(true && true || false && false); => true
        //     System.out.println(true && (true || false) && (false || true) && true || false || true || false); => true


    }
}