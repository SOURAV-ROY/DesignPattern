package TemplateMethodPattern;

public class VeggieHoagie extends Hoagie {

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
        System.out.print("Adding The Vegetables: ");
        for (String veggie : veggiesUsed) {
            System.out.print(veggie + " ");
        }
    }

    @Override
    void addCondiments() {
        System.out.print("Adding The Condiments: ");
        for (String condiments : condimentsUsed) {
            System.out.print(condiments + " ");
        }
    }
}
