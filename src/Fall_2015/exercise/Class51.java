package Fall_2015.exercise;

import java.util.Random;

/**
 * Created by Hussein on 11/15/15.
 */
public class Class51 {
    public static void main(String[] args) {
        String[][] array = {{"Suddenly", "he", "ran", "yesterday"}, {"Without warning", "she", "talked", "earlier"},
                {"Slowly", "it", "slept", "Tuesday"}, {"Silently", "I", "ate", "at once"},
                {"Sheepishly", "they", "laughed", "after a while"}, {"Hurriedly", "we", "cried", "in the house"},
                {"Confusingly", "someone", "yelled", "in the garden"}, {"Abruptly", "everyone", "sang", "for some time"},
                {"Deliberately", "all", "played", "Intermittently"}, {"Carelessly", "no one", "walked", "on and on and on"},
                {"Ominously", "You", "crawled", "on cue"}, {"Inexplicably", "A boy", "waved", "fervently"}};

        System.out.println(makeSentence(array));
    }

    public static String makeSentence(String[][] array) {
        Random r = new Random();
        String howString = array[r.nextInt(array.length)] [0];
        String whoString = array[r.nextInt(array.length)] [1];
        String whatString = array[r.nextInt(array.length)] [2];
        String whenString = array[r.nextInt(array.length)] [3];

        return String.format("%s, %s %s %s.", howString, whoString, whatString, whenString);
    }
}
