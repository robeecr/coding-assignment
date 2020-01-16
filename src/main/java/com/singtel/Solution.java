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
        System.out.println("--------------Rooster--------------");
        Animal rooster = new Rooster();
        rooster.walk();
        rooster.fly();
        rooster.sing();
        rooster.swim();
        System.out.println("--------------RoosterDelegate--------------");
        Animal roosterDelegate = new RoosterDelegate();
        roosterDelegate.walk();
        roosterDelegate.fly();
        roosterDelegate.sing();
        roosterDelegate.swim();
        System.out.println("--------------ParrotWithDog--------------");
        Parrot parrotWithDog = new Parrot();
        parrotWithDog.livingWithAnimal(new Dog());
        parrotWithDog.walk();
        parrotWithDog.fly();
        parrotWithDog.sing();
        parrotWithDog.swim();
        System.out.println("--------------ParrotWithCat--------------");
        Parrot parrotWithCat = new Parrot();
        parrotWithCat.livingWithAnimal(new Cat());
        parrotWithCat.walk();
        parrotWithCat.fly();
        parrotWithCat.sing();
        parrotWithCat.swim();
        System.out.println("--------------ParrotWithRooster--------------");
        Parrot parrotWithRooster = new Parrot();
        parrotWithRooster.livingWithAnimal(new Rooster());
        parrotWithRooster.walk();
        parrotWithRooster.fly();
        parrotWithRooster.sing();
        parrotWithRooster.swim();
        System.out.println("--------------ParrotWithDuck--------------");
        Parrot parrotWithDuck = new Parrot();
        parrotWithDuck.livingWithAnimal(new Duck());
        parrotWithDuck.walk();
        parrotWithDuck.fly();
        parrotWithDuck.sing();
        parrotWithDuck.swim();

    }
}
