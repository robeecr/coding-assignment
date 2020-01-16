package main.java.com.singtel;

public class Parrot extends Bird {
    Animal animal;
    public void livingWithAnimal(Animal animal){
        this.animal = animal;
    }
    @Override
    public boolean sing() {
        if (animal != null) {
            return animal.sing();
        }
        System.out.println("I am singing");
        return true;
    }
}
