/*Write a program to find the number of counts in the following  String .
*Store the output inMap< String ,Integer> as key value pair.
*Input :   String  str = “one one -one___two,,three,one @three*one?two”;
*Output : {"one":5 , "two":2, "three" :2}
 */
package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class WordCountUsingMap {
    /*
    Method to count number of words
     */
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
}
