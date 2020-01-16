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
        System.out.println("--------------Shark--------------");
        Fish shark = new Shark();
        shark.walk();
        shark.fly();
        shark.sing();
        shark.swim();
        shark.size();
        shark.colour();
        shark.makeJokes();
        shark.eat();
        System.out.println("--------------ClownFish--------------");
        Fish clownfish = new Clownfish();
        clownfish.walk();
        clownfish.fly();
        clownfish.sing();
        clownfish.swim();
        clownfish.size();
        clownfish.colour();
        clownfish.makeJokes();
        clownfish.eat();
        System.out.println("--------------Dolphin--------------");
        Dolphin dolphin= new Dolphin();
        dolphin.hasFishBehaviour(new Shark());
        dolphin.walk();
        dolphin.fly();
        dolphin.sing();
        dolphin.swim();
        System.out.println("--------------Butterfly--------------");
        Animal butterfly = new Butterfly();
        butterfly.walk();
        butterfly.fly();
        butterfly.sing();
        butterfly.swim();
        System.out.println("--------------Caterpillar--------------");
        Butterfly caterpillar = new Butterfly();
        caterpillar.setCaterpillar(true);
        caterpillar.walk();
        caterpillar.fly();
        caterpillar.sing();
        caterpillar.swim();
        System.out.println("--------------AnimalCount--------------");
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Shark(),
                new Clownfish(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
        int flyCount = 0, walkCount = 0, singCount = 0, swimCount = 0;
        for(Animal animal: animals){
            System.out.println(animal.getClass().getName());
            System.out.println("--------------CountStart--------------");
            if(animal.fly()){
                flyCount++;
            }
            if(animal.walk()){
                walkCount++;
            }
            if(animal.sing()){
                singCount++;
            }
            if(animal.swim()){
                swimCount++;
            }
            System.out.println("--------------CountEnd--------------");
        }
        System.out.println("Number of Animals that can fly: " + flyCount);
        System.out.println("Number of Animals that can walk: " + walkCount);
        System.out.println("Number of Animals that can sing: " + singCount);
        System.out.println("Number of Animals that can swim: " + swimCount);
    }
}
