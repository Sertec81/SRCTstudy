package day10;

public class forLoop0 {
    public static void main(String[] args) {

        int x = 6;
        x--; //which means the same thing as x = x - 1;
        x++; //which means the same thing as x = x + 1;

        x += 2; //which means the same thing as x = x + 2;
        x -= 2; //which means the same thing as x = x - 2;

        x += 3; //which means the same thing as x = x + 3;

        //i++ means the same thing as i = i + 1;
        //i
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + 1);
        }
        for (int h = 1; h <= 11; h = h + 2) {
            System.out.println(h);
        }

        }
    }
