package ObserverPattern.Youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private final List<Subscriber> subs = new ArrayList<>();
    String title;

    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }

    public void unSubscribe(Observer ob) {
        subs.remove(ob);
    }

    public void notifySubscribers() {
        for (Observer sub : subs) {
            sub.update();
        }
    }

    public void upload(String title) {
        this.title = title;
        notifySubscribers();
    }
}
