package LessonHashMap;

import java.util.HashMap;

public class Application {

    public static void main(String arg[]){
        HashMap<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("Brave","Ready to face and endure danger or pain; showing courage");
        dictionary.put("Brilliant","Exceptionally clever or talented");
        dictionary.put("Joy","a feeling of great pleasure and happiness");
        dictionary.put("Confidence","the state of feeling certain about the truth of something");

        for(String word: dictionary.keySet()){
            System.out.println(word);
        }

    }
}
