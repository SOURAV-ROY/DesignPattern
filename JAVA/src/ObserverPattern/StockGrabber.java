package ObserverPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double pixelPrice;

    public StockGrabber(){

        // Creates an ArrayList to hold all observers
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {

        // Adds a new observer to the ArrayList
        observers.add(newObserver);
    }

    public void unregister(Observer deleteObserver) {

        // Get the index of the observer to delete
        int observerIndex = observers.indexOf(deleteObserver);

        // Print out message (Have to increment index to match)
        System.out.println("Observer " + (observerIndex+1) + " deleted");

        // Removes observer from the ArrayList
        observers.remove(observerIndex);
    }

    public void notifyObserver() {

        // Cycle through all observers and notifies them of
        // price changes
        for(Observer observer : observers){
            observer.update(ibmPrice, applePrice, pixelPrice);
        }
    }

    // Change prices for all stocks and notifies observers of changes
    public void setIBMPrice(double newIBMPrice){

        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAPPLEPrice(double newAPPLEPrice){

        this.applePrice = newAPPLEPrice;
        notifyObserver();
    }

    public void setPIXELPrice(double newPIXELPrice){

        this.pixelPrice = newPIXELPrice;

        notifyObserver();
    }
}
