package SingletonPattern;
import java.util.LinkedList;

public class GetTheTiles implements Runnable{
    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOneTiles = newInstance.getTitles(6);
        System.out.println("Player : "+playerOneTiles);
        System.out.println("Got Tiles");
    }
}
