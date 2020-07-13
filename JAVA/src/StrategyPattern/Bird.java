package StrategyPattern;

public class Bird extends Animal{
    public Bird(){
        super();
        setName("Moyna");
        flyingType = new ItFlys();
    }
}
