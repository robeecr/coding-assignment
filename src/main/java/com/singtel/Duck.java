package main.java.com.singtel;

public class Duck extends Bird {
    @Override
    public boolean sing() {
        System.out.println("Quack, quack");
        return true;
    }
}
