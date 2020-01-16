package main.java.com.singtel;

public class Chicken extends Bird {
    @Override
    public boolean fly() {
        System.out.println("I cannot fly");
        return false;
    }
    @Override
    public boolean sing() {
        System.out.println("Cluck, cluck");
        return true;
    }
}
