package main.java.com.singtel;

public class Shark implements Fish {
    @Override
    public void size() {
        System.out.println("I am large");
    }
    @Override
    public void colour() {
        System.out.println("I am grey");
    }
    @Override
    public void makeJokes() {
        System.out.println("I don't make jokes");
    }
    @Override
    public void eat() {
        System.out.println("I eat other fish");
    }
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
