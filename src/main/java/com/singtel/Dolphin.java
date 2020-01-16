package main.java.com.singtel;

public class Dolphin implements Animal{
    Fish fish;
    public void hasFishBehaviour(Fish fish){
        this.fish = fish;
    }
    @Override
    public boolean walk() {
         return fish.walk();
    }

    @Override
    public boolean fly() {
        return fish.fly();
    }

    @Override
    public boolean sing() {
        return fish.sing();
    }

    @Override
    public boolean swim() {
        return fish.swim();
    }
}
