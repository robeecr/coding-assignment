package main.java.com.singtel;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class SolutionTest {
    @Test
    public void birdTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Animal bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        assertEquals("I am walking\nI am flying\nI am singing\n", outContent.toString());
    }
    @Test
    public void duckTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Animal duck = new Duck();
        duck.walk();
        duck.fly();
        duck.sing();
        duck.swim();
        assertEquals("I am walking\nI am flying\nQuack, quack\nI am swimming\n", outContent.toString());
    }
    @Test
    public void chickenTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Animal chicken = new Chicken();
        chicken.walk();
        chicken.fly();
        chicken.sing();
        chicken.swim();
        assertEquals("I am walking\nI cannot fly\nCluck, cluck\nI am swimming\n", outContent.toString());
    }
    @Test
    public void roosterTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Animal rooster = new Rooster();
        rooster.walk();
        rooster.fly();
        rooster.sing();
        rooster.swim();
        assertEquals("I am walking\nI cannot fly\nCock-a-doodle-doo\nI am swimming\n", outContent.toString());
    }
    @Test
    public void roosterDelegateTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Animal roosterDelegate = new RoosterDelegate();
        roosterDelegate.walk();
        roosterDelegate.fly();
        roosterDelegate.sing();
        roosterDelegate.swim();
        assertEquals("I am walking\nI cannot fly\nCock-a-doodle-doo\nI am swimming\n", outContent.toString());
    }
    @Test
    public void parrotWithDogTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Parrot parrotWithDog = new Parrot();
        parrotWithDog.livingWithAnimal(new Dog());
        parrotWithDog.walk();
        parrotWithDog.fly();
        parrotWithDog.sing();
        parrotWithDog.swim();
        assertEquals("I am walking\nI am flying\nWoof, woof\nI am swimming\n", outContent.toString());
    }
    @Test
    public void parrotWithCatTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Parrot parrotWithCat= new Parrot();
        parrotWithCat.livingWithAnimal(new Cat());
        parrotWithCat.walk();
        parrotWithCat.fly();
        parrotWithCat.sing();
        parrotWithCat.swim();
        assertEquals("I am walking\nI am flying\nMeow\nI am swimming\n", outContent.toString());
    }
    @Test
    public void parrotWithRoosterTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Parrot parrotWithRooster = new Parrot();
        parrotWithRooster.livingWithAnimal(new Rooster());
        parrotWithRooster.walk();
        parrotWithRooster.fly();
        parrotWithRooster.sing();
        parrotWithRooster.swim();
        assertEquals("I am walking\nI am flying\nCock-a-doodle-doo\nI am swimming\n", outContent.toString());
    }
    @Test
    public void parrotWithDuckTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Parrot parrotWithDuck = new Parrot();
        parrotWithDuck.livingWithAnimal(new Duck());
        parrotWithDuck.walk();
        parrotWithDuck.fly();
        parrotWithDuck.sing();
        parrotWithDuck.swim();
        assertEquals("I am walking\nI am flying\nQuack, quack\nI am swimming\n", outContent.toString());
    }
    @Test
    public void sharkTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Fish shark = new Shark();
        shark.walk();
        shark.fly();
        shark.sing();
        shark.swim();
        shark.size();
        shark.colour();
        shark.makeJokes();
        shark.eat();
        assertEquals("I cannot walk\nI cannot fly\nI cannot sing\nI am swimming\nI am large\nI am grey\nI don't make jokes\nI eat other fish\n", outContent.toString());
    }
    @Test
    public void clownFishTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Fish clownFish = new Clownfish();
        clownFish.walk();
        clownFish.fly();
        clownFish.sing();
        clownFish.swim();
        clownFish.size();
        clownFish.colour();
        clownFish.makeJokes();
        clownFish.eat();
        assertEquals("I cannot walk\nI cannot fly\nI cannot sing\nI am swimming\nI am small\nI am orange\nI make jokes\nI don't eat other fish\n", outContent.toString());
    }
    @Test
    public void dolphinTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Dolphin dolphin= new Dolphin();
        dolphin.hasFishBehaviour(new Shark());
        dolphin.walk();
        dolphin.fly();
        dolphin.sing();
        dolphin.swim();
        assertEquals("I cannot walk\nI cannot fly\nI cannot sing\nI am swimming\n", outContent.toString());
    }
    @Test
    public void butterflyTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Animal butterfly= new Butterfly();
        butterfly.walk();
        butterfly.fly();
        butterfly.sing();
        butterfly.swim();
        assertEquals("I cannot walk\nI am flying\nI cannot sing\nI cannot swim\n", outContent.toString());
    }
    @Test
    public void caterpillarTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Butterfly caterpillar= new Butterfly();
        caterpillar.setCaterpillar(true);
        caterpillar.walk();
        caterpillar.fly();
        caterpillar.sing();
        caterpillar.swim();
        assertEquals("I can walk(crawl)\nI cannot fly\nI cannot sing\nI cannot swim\n", outContent.toString());
    }
}