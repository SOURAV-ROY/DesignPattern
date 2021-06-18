package ObserverPattern.Youtube;

public interface Observer {

    void update();

    void subscribeChannel(Channel ch);
}
