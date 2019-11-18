package day25_JavaMethods2;

public class Example {
    public static void main(String[] args) {
        day24_ClassesAndAttributes.Example ex = new day24_ClassesAndAttributes.Example();
     //   ex.DifferentMethod1();
        DifferentMethod2();
    }
    private static void DifferentMethod2() {
    }
    public void DifferentMethod1() {
        System.out.println("print something");
    }

    private static void AnyMethod() {
        System.out.println("print here");


    }
}