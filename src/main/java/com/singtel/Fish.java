package main.java.com.singtel;

public class Fish implements Animal {
    @Override
    public boolean walk() {
        System.out.println("I cannot walk");
        return false;
    }
    @Override
    public boolean fly() {
        System.out.println("I cannot fly");
        return false;
    }
    @Override
    public boolean sing() {
        System.out.println("I cannot sing");
        return false;
    }
    @Override
    public boolean swim() {
        System.out.println("I am swimming");
        return true;
    }
}
