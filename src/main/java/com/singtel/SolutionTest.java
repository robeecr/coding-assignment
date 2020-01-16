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
}