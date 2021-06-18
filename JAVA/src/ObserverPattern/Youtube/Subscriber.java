package ObserverPattern.Youtube;

public class Subscriber implements Observer {
    private final String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        super();
        this.name = name;
    }

    public void update() {
        System.out.println("Hey " + name + ", Video Updated ==> " + channel.title);
    }

    public void subscribeChannel(Channel ch) {
        channel = ch;
    }
}
