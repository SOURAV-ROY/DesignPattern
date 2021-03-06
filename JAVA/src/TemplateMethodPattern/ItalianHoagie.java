package TemplateMethodPattern;

public class ItalianHoagie extends Hoagie {
    String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    void addMeat() {
        System.out.print("Adding The Meat : ");
        for (String meat : meatUsed) {
            System.out.print(meat + " ");
        }
    }

    @Override
    void addCheese() {
        System.out.print("Adding The Cheese : ");
        for (String cheese : cheeseUsed) {
            System.out.print(cheese + " ");
        }
    }

    @Override
    void addVegetables() {
        System.out.print("Adding The Vegetables : ");
        for (String veggie : veggiesUsed) {
            System.out.print(veggie + " ");
        }
    }

    @Override
    void addCondiments() {
        System.out.print("Adding The Condiments : ");
        for (String condiments : condimentsUsed) {
            System.out.print(condiments + " ");
        }
    }
//    public void makeSandwich(){
//        cutBun();
//        addMeat();
//        addCheese();
//        addVegetables();
//        addCondiments();
//        wrapTheHoagie();
//    }
//
//    public void cutBun(){
//        System.out.println("The Hoagie is Cut");
//    }
}
