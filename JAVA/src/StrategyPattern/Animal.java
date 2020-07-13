package StrategyPattern;

public class Animal {
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Flys flyingType;

    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }
    public double getHeight() {
        return height;
    }

    public void setWeight(int newWeight) {
        if (newWeight > 0) {
            weight = newWeight;
        } else {
            System.out.println("Weight Must Be Biggr Than 0");
        }
    }
    public double getWeight() {
        return weight;
    }

    public String tryToFly(){
        return flyingType.fly();
    }
    public void setFlyingAbility(Flys newFlyType){
        flyingType = newFlyType;
    }
}
