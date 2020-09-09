package SingletonPattern;
import java.util.LinkedList;

public class ScrabbleTest {
    public static void main(String[] args) {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTitles = newInstance.getTitles(7);

        System.out.println("Player 1: "+playerOneTitles);
        System.out.println(newInstance.getLetterList());

        Singleton instanceTwo = Singleton.getInstance();
        System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));
        System.out.println(instanceTwo.getLetterList());

        LinkedList<String> playerTwoTitles = newInstance.getTitles(5);

        System.out.println("Player 2: "+playerTwoTitles);
    }
}
