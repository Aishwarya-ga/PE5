package com.pe5;

import java.util.HashMap;
import java.util.Map;

public class WordCountBooleanUsingMap {
    public Map<String,Boolean> toReturnBooleanBasedOnCount(String[] string){
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        for(int i=0; i< string.length;i++){
            int count = 0;
            for(int j=0;j < string.length;j++){
                if(string[i].equals(string[j])){
                    count++;
                }
            }
            if(count>1){
                map.put(string[i],true);
            }
            else
                map.put(string[i],false);
        }
        return map;
    }

    public static void main(String[] args){
        WordCountBooleanUsingMap wordCountBooleanUsingMap = new WordCountBooleanUsingMap();
        String arr[] = {"a","b","c","d","a","c","c"};
        System.out.println(wordCountBooleanUsingMap.toReturnBooleanBasedOnCount(arr));
    }
}
