package TemplateMethodPattern;

public abstract class Hoagie {
    final void makeSandwich() {
        cutBun();
        if (customerWantMeat()) {
            addMeat();
        }
        if (customerWantCheese()) {
            addCheese();
        }
        if (customerWantVegetables()) {
            addVegetables();
        }
        if (customerWantCondiments()) {
            addCondiments();
        }
        wrapTheHoagie();
    }

    public void cutBun(){
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

    public void wrapTheHoagie(){
        System.out.println("Wrap The Hoagie !!");
    }
}
