package ua.univer.lesson11;

import java.util.*;

public class ProgramString {
    public static void main(String[] args) {
        String str = "mama mila ramumama mila ramumama mila ramu";
        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        Set<String> uniqName = new HashSet<>(Arrays.asList(words));
        System.out.println(uniqName);

        Map<String, Integer> freqMap = new HashMap<>();
        for (var word : words) {
            if (!freqMap.containsKey(word)){
                freqMap.put(word, 1);
            }else
                freqMap.put(word,freqMap.get(word)+1);
        }
        System.out.println(freqMap);
        Map<String, Integer> syncfreqMap = Collections.synchronizedMap(freqMap);
    }
}
