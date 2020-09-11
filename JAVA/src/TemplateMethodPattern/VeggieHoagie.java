package TemplateMethodPattern;

import javax.swing.*;

public class VeggieHoagie extends Hoagie {
    //    String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
//    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    boolean customerWantMeat() {
        return false;
    }

    boolean customerWantCheese() {
        return false;
    }

    @Override
    void addMeat() {
    }

    @Override
    void addCheese() {
    }

    @Override
    void addVegetables() {
        System.out.println("Adding The Vegetables: ");
        for (String veggie : veggiesUsed) {
            System.out.println(veggie + " ");
        }
    }

    @Override
    void addCondiments() {
        System.out.println("Adding The Condiments: ");
        for (String condiments : condimentsUsed) {
            System.out.println(condiments + " ");
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
