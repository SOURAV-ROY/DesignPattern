package TemplateMethodPattern;

public abstract class Hoagie {

    boolean afterFirstCondiment = false;

    final void makeSandwich() {

        cutBun();

        if (customerWantMeat()) {
            addMeat();
            afterFirstCondiment = true;
        }
        if (customerWantCheese()) {
            if (afterFirstCondiment) {
                System.out.println();
            }
            addCheese();
            afterFirstCondiment = true;
        }
        if (customerWantVegetables()) {
            if (afterFirstCondiment) {
                System.out.println();
            }
            addVegetables();
            afterFirstCondiment = true;
        }
        if (customerWantCondiments()) {
            if (afterFirstCondiment) {
                System.out.println();
            }
            addCondiments();
            afterFirstCondiment = true;
        }

        wrapTheHoagie();
    }

    public void cutBun() {
        System.out.println("The Hoagie Is CUT !!!");
    }

    abstract void addMeat();

    abstract void addCheese();

    abstract void addVegetables();

    abstract void addCondiments();

    boolean customerWantMeat() {
        return true;
    }

    boolean customerWantCheese() {
        return true;
    }

    boolean customerWantVegetables() {
        return true;
    }

    boolean customerWantCondiments() {
        return true;
    }

    public void wrapTheHoagie() {
        System.out.println("\nWrap The Hoagie !!");
    }
}
