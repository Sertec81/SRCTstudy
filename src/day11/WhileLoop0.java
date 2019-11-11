package day11;

import java.util.Scanner;

public class WhileLoop0 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//
//        }
       // System.out.println(5+4+3+2+1);
        int i = 1;
        while(i <=5) {
            System.out.println(i);
            i++;
        }

    }

    public static class WhileTask1 {
        // PART1, WRITE A PROGRAM WHICH ASK YOU TO PROVIDE A TEXT AND IT SHOULD STOP WHEN YOU TYPE "QUIT"
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.println("Write a string");
                String line = scan.nextLine();
            // part 1
            while(!line.equals("quit")) { // S! ="EXIT" or !line   // != not equal// //(unless print exit, it will run forever)
                System.out.println("write a string");
                line = scan.nextLine();
            }
                //      PART2, CONTINUE PART1 BUT ALSO CHECK FOR LENGT() OF STRING
                //   IF LENGTH IS BIGGER THAN 10, PROGRAM SHOULD SAY THAT STRING IS TOO LARGE
                //  ex:
                //   IN THE WHILE LOOP...
                //  WJHERJWHERGRHJRHR
              //  part 2
                    if(line.length()>=10) {
                        System.out.println("string is too large");
                    }
                        // part3 continue part2, if provided string is equals to your name program should print your surname
                        // part 3
                if(line.equals("Sinan")) {
                    System.out.println("Erdem");
                }

            }
            }

    public static class whileTask2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("write a text:");
                String line = scanner.nextLine();

                if (line.equals("quit")) {
                    break;
                }
                //part1 check for the #,@,$,* symbols also for a strong password
                // hint: fill if statement with condition
                if (line.contains("#") || line.contains("@") || line.contains("$") || line.contains("*")) {

                    System.out.println("strong password");

                    //part2. continue Part1 if you text does not contain
                    // those symbols are "weak password"
                } else {
                    System.out.println("weak password");
                }
                // part3. check text if it's only uppercase print"use Lowercase Letters"
                // Hint: Line.toUpperCase();
                // Line.equals();
                //"ABCDE" == "ABCDE"
                String lineUpperCase = line.toUpperCase();
                if (line.equals(lineUpperCase)) {
                    System.out.println("use lowercase letters");
                }
                //PART4. CHECK TEXT IF IT'S ONLY LOWERCASE PRINT "USE UPPERCASE LETTERS"
                String lineLowerCase = line.toLowerCase();
                if (line.equals(lineLowerCase)) {
                    System.out.println("use UpperCase Letters");
                }
                // OR WE CAN USE ELSE IF, EXAMPLE;
                if (line.equals(lineUpperCase)) {
                    System.out.println("use lowercase letters");
                } else if (line.equals(lineLowerCase)) {
                    System.out.println("use UpperCase Letters");

                }

            }

        }
        }

    public static class WhileEx1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);



    //        while(!s.equals("exit")){ // s ! = "Exit"
    //            System.out.println("write a string)");
    //            s= scan.nextLine();
            System.out.println("WRITE A STRING");
            String s = scan.nextLine();
    //        }
            while (!s.equals("O")) { // s ! = "Exit"
                System.out.println("write a string)");
                s = scan.nextLine();
    // when you write "Exit" progtam will be exit , otherwise it will none stop to writing, even if you write o it will be stop also.
            }

        }
            }

    public static class WhileEx3 {
        public static void main(String[] args) {
    //     int i = 0;
    //     while(true) {
    //         i++;
    //         System.out.println(i);
    //
    //         if (i == 5) {
    //             break;
    //         }
    //
    //     }
    //        System.out.println("stop");
            Scanner s = new Scanner(System.in);
            System.out.println("begin");
            while(true) {
                System.out.println("write text:");
                String string = s.nextLine();

                String str;
                if (string.equals("quit")) {
                break;
                }

            }
            System.out.println("end");

         }
        }
}