package Day9_IfStatements;

public class SwitchStatement {
    // java program to illustrate switch-case
    public static void main(String[] args) {
        int i = 9;
        switch (i) {
            case 0:
                System.out.println("i is zero.");
                break;
            case 1:
                System.out.println("i is one.");
            case 2:
                System.out.println("i is two.");
                break;
            default:
                System.out.println("i is greater than 2");

        }
        //output:
        // i is greater than tw2.

        int h = 15;
        switch(h){
            case 0:
                System.out.println("h is zero.");
                break;
            case 1:
                System.out.println("h is one.");
            case 2:
                System.out.println("h is two.");

            case 3:
                System.out.println("h is three");
                break;
            default:
                System.out.println(" h is bigger than 3.");
        }

    }
}






