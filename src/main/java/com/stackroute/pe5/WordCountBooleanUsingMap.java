/*Write a program where an array of strings is input and output is a
*Map< String ,boolean> whereeach different  string  is a key and its
*value is true if that  string  appears 2 or more times in the arrayInput :
*String  arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
*Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */
package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class WordCountBooleanUsingMap {
    /*
    method to return boolean value based on count
     */
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
}
