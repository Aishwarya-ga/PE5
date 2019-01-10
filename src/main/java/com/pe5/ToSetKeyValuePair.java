package com.pe5;

import java.util.*;

public class ToSetKeyValuePair {
    public Map<String,String> toSetKeyValue(Map<String,String> mapItems){
        Iterator<Map.Entry<String,String>> it = mapItems.entrySet().iterator();
        String key= "";
        String value = "";
        Boolean flag = false;
        if (!it.hasNext())
            return null;
        while(it.hasNext()) {
            Map.Entry<String,String> Entry = it.next();
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

    public static void main(String[] args){
        ToSetKeyValuePair toSetKeyValuePair = new ToSetKeyValuePair();
        Map<String,String>maps = new LinkedHashMap<String, String>();
        maps.put("val1","java");
        maps.put("val2","c++");
       // System.out.println(maps);
        System.out.println(toSetKeyValuePair.toSetKeyValue(maps));
    }
}
