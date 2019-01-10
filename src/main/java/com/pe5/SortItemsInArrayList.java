package com.pe5;

import java.util.*;

public class SortItemsInArrayList {
    public ArrayList<String> toSortArrayList(String[] inputString){
        if(inputString.length != '\0') {
            Set<String> setItems = new TreeSet<String>();
            for (String words : inputString) {
                setItems.add(words);
            }
            ArrayList<String> output = new ArrayList<String>();
            Iterator<String> it = setItems.iterator();
            while (it.hasNext()) {
                output.add(it.next());
            }
            return output;
        }
        return null;
    }

    public static void main(String[] args){
        SortItemsInArrayList sortItemsInArrayList = new SortItemsInArrayList();
        String[] input = {"Henry","Olive","Alice","Bluto","Eugene"};
        System.out.println(sortItemsInArrayList.toSortArrayList(input));
    }
}
