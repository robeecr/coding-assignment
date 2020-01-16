package main.java.com.singtel;

public class Cat implements Animal {
    @Override
    public boolean walk() {
        System.out.println("I am walking");
        return true;
    }
    @Override
    public boolean fly() {
        System.out.println("I cannot fly");
        return false;
    }
    @Override
    public boolean sing() {
        System.out.println("Meow");
        return true;
    }
    @Override
    public boolean swim() {
        System.out.println("I am swimming");
        return true;
    }
}
