package ObserverPattern.Youtube;

public class Youtube {
    public static void main(String[] args) {

        Channel sourav = new Channel();

        Subscriber s1 = new Subscriber("ROY");
        Subscriber s2 = new Subscriber("Ami");
        Subscriber s3 = new Subscriber("Amra");
        Subscriber s4 = new Subscriber("Sobai");
        Subscriber s5 = new Subscriber("Tui");

        sourav.subscribe(s1);
        sourav.subscribe(s2);
        sourav.subscribe(s3);
        sourav.subscribe(s4);
        sourav.subscribe(s5);

        sourav.unSubscribe(s3);
        sourav.unSubscribe(s1);
        // sourav.subscribe(s3);

        s1.subscribeChannel(sourav);
        s2.subscribeChannel(sourav);
        s3.subscribeChannel(sourav);
        s4.subscribeChannel(sourav);
        s5.subscribeChannel(sourav);

        sourav.upload("How to learn DesignPattern");
        System.out.println("**********************************************************");
        sourav.upload("How to learn DesignPattern 2.0");
    }
}
