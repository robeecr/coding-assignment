package main.java.com.singtel;

public class Solution {
    public static void main(String[] args) {
        System.out.println("--------------BIRD--------------");
        Animal bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        System.out.println("--------------Duck--------------");
        Animal duck = new Duck();
        duck.walk();
        duck.fly();
        duck.sing();
        duck.swim();
        System.out.println("--------------Chicken--------------");
        Animal chicken = new Chicken();
        chicken.walk();
        chicken.fly();
        chicken.sing();
        chicken.swim();
    }
}
