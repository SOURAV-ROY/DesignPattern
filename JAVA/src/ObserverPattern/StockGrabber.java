package ObserverPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double pixelPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer "+ (observerIndex+1) + "Deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers){
            observer.update(ibmPrice, applePrice, pixelPrice);
        }
    }

    public void setIbmPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setApplePrice(double newAPPLEPrice){
        this.applePrice= newAPPLEPrice;
        notifyObserver();
    }

    public void setPixelPrice(double newPIXELPrice){
        this.pixelPrice= newPIXELPrice;
        notifyObserver();
    }
}
