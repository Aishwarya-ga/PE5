/*Write a method that accepts a Map object having two key-value pairs with the
*keys val1 and val2.Modify and return the given map as follows:
*a. If the key `val1` has a value, set the key `val2` to have that value.
*b. Set the key `val1` to have the value `"  "` (empty string ).
*Example 1:The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":"java"}
*Example 2:The map {"val1": "mars", "val2": "saturn"}  should return {"val1": " ", "val2":"mars"}
 */
package com.stackroute.pe5;

import java.util.*;

public class ToSetKeyValuePair {
    /*
    method to set key value pair
    */
    public Map<String,String> toSetKeyValue(Map<String,String> mapItems){
        Iterator<Map.Entry<String,String>> iterator = mapItems.entrySet().iterator();
        String key= "";
        String value = "";
        Boolean flag = false;
        if (!iterator.hasNext())
            return null;
        while(iterator.hasNext()) {
            Map.Entry<String,String> Entry = iterator.next();
            key = Entry.getKey();
            if(flag == false && key!=null) {
                value = Entry.getValue();
                mapItems.put(key," ");
                flag = true;
            }
            else if (flag == true && key!=null) {
                mapItems.put(key,value);
            }
        }
        return mapItems;
    }
}
