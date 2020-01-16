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
}