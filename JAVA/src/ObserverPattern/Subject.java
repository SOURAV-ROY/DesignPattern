package ObserverPattern;

public interface Subject {
    public void register(Observer oo);
    public void unregister(Observer o);
    public void notifyObserver();
}
