package StrategyPattern;

public class Dog extends Animal {
    public void digHole() {
        System.out.println("Dug A Hole");
    }

    public Dog() {
        super();
        setName("Doggy");
        flyingType = new CantFly();
    }
}
