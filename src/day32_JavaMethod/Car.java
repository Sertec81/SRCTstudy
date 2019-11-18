package day32_JavaMethod;

public class Car {
    public static void main(String[] args) {

    }
    public int speed;
    public int door;
    public int wheels;
    public int model;
    public int color;
    public int engine;
    public String state; // new or old

    public boolean drive() {
        if (wheels > 0) {
            return true;
        }else {
            return false;
        }


    }

}
