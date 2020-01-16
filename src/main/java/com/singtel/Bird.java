package main.java.com.singtel;

public class Bird implements Animal {
    @Override
    public void walk() {
        System.out.println("I am walking");
    }
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
    @Override
    public void sing() {
        System.out.println("I am singing");
    }
}
