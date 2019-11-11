package Day9_IfStatements;

public class ifelsestatement3 {
    public static void main(String[] args) {
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;
        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }


        }

        System.out.println("Largest number is" + largestNumber);

        double m1 = -2.5, m2 = 1.5, m3 = -3.5, largestnumber;

        if (m1 >= m2) {
            if (m1 >= m3) {
                largestnumber = m1;
            } else {
                largestnumber = m3;
            }
        }else{
                if (m2 >= m3) {
                    largestnumber = m2;
                } else {
                    largestnumber = m3;
                }
            }

        System.out.println("largest number is" + largestnumber);
        }

    }
