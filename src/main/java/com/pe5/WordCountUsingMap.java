package com.pe5;

import java.util.HashMap;
import java.util.Map;

public class WordCountUsingMap {
    public Map<String,Integer> toCountWordNumber(String string){
        if(string != null) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            String[] words = string.split("\\W|\\_|\\d");
            for (String word : words) {
                String keyword = word.toLowerCase();
                if (map.containsKey(keyword)) {
                    map.put(keyword, map.get(keyword) + 1);
                } else {
                    map.put(keyword, 1);
                }
            }
            map.remove("");
            return map;
        }
        return null;
    }

    public static void main(String[] args){
        WordCountUsingMap wordCountUsingMap = new WordCountUsingMap();
        System.out.println(wordCountUsingMap.toCountWordNumber("one one -one___two,,three,one @three*one?two"));
    }
}
