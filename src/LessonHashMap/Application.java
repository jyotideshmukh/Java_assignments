package LessonHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

    public static void main(String arg[]){
        HashMap<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("Brave","Ready to face and endure danger or pain; showing courage");
        dictionary.put("Brilliant","Exceptionally clever or talented");
        dictionary.put("Joy","a feeling of great pleasure and happiness");
        dictionary.put("Confidence","the state of feeling certain about the truth of something");

        /*for(String word: dictionary.keySet()){
            System.out.println(word+":"+dictionary.get(word));
        }*/

       /* for(Map.Entry<String, String> entry : dictionary.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }*/


        LinkedHashMap<String, String> dictionary2 = new LinkedHashMap<String, String>();

        dictionary2.put("Brave","Ready to face and endure danger or pain; showing courage");
        dictionary2.put("Brilliant","Exceptionally clever or talented");
        dictionary2.put("Joy","a feeling of great pleasure and happiness");
        dictionary2.put("Confidence","the state of feeling certain about the truth of something");

       /* for(String word: dictionary2.keySet()){
            System.out.println(word+":"+dictionary.get(word));
        }*/


        System.out.println("TreeMap");
        TreeMap<String, String> dictionary3 = new TreeMap<String, String>();

        dictionary3.put("Brave","Ready to face and endure danger or pain; showing courage");
        dictionary3.put("Brilliant","Exceptionally clever or talented");
        dictionary3.put("Joy","a feeling of great pleasure and happiness");
        dictionary3.put("Confidence","the state of feeling certain about the truth of something");
        dictionary3.put("Brilliant", "xxxxxxx");
        /*for(String word: dictionary.keySet()){
            System.out.println(word+":"+dictionary.get(word));
        }*/

        for(Map.Entry<String, String> entry : dictionary3.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
