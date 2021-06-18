package ObserverPattern.Youtube;

public interface Subject {

    void subscribe(Subscriber sub);

    void unSubscribe(Observer sub);

    void notifySubscribers();

//    void upload();
}
