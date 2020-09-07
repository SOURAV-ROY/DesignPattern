package SingletonPattern;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

public class Singleton {
    private static Singleton firstInstance = null;

    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d"};

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
    static boolean firstThread = true;

    private Singleton() {
    }

    //    public static synchronized Singleton getInstance() {
    public static Singleton getInstance() {

        if (firstInstance == null) {
            if (firstThread) {
                firstThread = false;
                Thread.currentThread();
                try {
                    Thread.sleep(1000); // First Thread Sleeping / Wakes Up
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            synchronized (Singleton.class) {
//                if (firstInstance == null) {
            firstInstance = new Singleton();
            Collections.shuffle(firstInstance.letterList);
//                }
//            }
        }
        return firstInstance;
    }

    public LinkedList<String> getLetterList() {
        return firstInstance.letterList;
    }

    public LinkedList<String> getTitles(int howManyTitles) {
        LinkedList<String> tilesToSend = new LinkedList<String>();
        for (int i = 0; i <= howManyTitles; i++) {
            tilesToSend.add(firstInstance.letterList.remove(0));
        }
        return tilesToSend;
    }
}
