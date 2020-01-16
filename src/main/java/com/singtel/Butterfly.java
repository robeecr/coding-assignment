package main.java.com.singtel;

public class Butterfly implements Animal {
    boolean isCaterpillar;
    public boolean isCaterpillar() {
        return isCaterpillar;
    }

    public void setCaterpillar(boolean caterpillar) {
        this.isCaterpillar = caterpillar;
    }
    @Override
    public boolean walk() {
        if(isCaterpillar){
            System.out.println("I can walk(crawl)");
            return true;
        } else {
            System.out.println("I cannot walk");
            return false;
        }
    }
    @Override
    public boolean fly() {
        if(isCaterpillar){
            System.out.println("I cannot fly");
            return false;
        } else {
            System.out.println("I am flying");
            return true;
        }
    }
    @Override
    public boolean sing() {
        System.out.println("I cannot sing");
        return false;
    }
    @Override
    public boolean swim() {
        System.out.println("I cannot swim");
        return false;
    }
}
