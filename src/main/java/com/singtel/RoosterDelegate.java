package main.java.com.singtel;

public class RoosterDelegate extends Bird{
    Chicken chicken = new Chicken();
    @Override
    public boolean fly() {
        return chicken.fly();
    }
    @Override
    public boolean sing() {
        System.out.println("Cock-a-doodle-doo");
        return true;
    }

}
