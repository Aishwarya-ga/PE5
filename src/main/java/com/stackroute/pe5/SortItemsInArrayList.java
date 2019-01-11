/*Write a program to implement set interface which sorts the given randomly
*ordered names inascending order. Convert the sorted set in to an  array list
*Input : Harry  Olive  Alice  Bluto  Eugene
*Output :Sorted Set :  Alice  Bluto  Eugene  Harry  Olive
*Array list  from Set :  Alice Bluto Eugene Harry Olive
 */
package com.stackroute.pe5;

import java.util.*;

public class SortItemsInArrayList {
    /*
    method to sort array elements
     */
    public ArrayList<String> toSortArrayList(String[] inputString){
        if(inputString.length != '\0') {
            Set<String> setItems = new TreeSet<String>();
            for (String words : inputString) {
                setItems.add(words);
            }
            ArrayList<String> output = new ArrayList<String>();
            //Iterator is used to iterate through Collections
            Iterator<String> it = setItems.iterator();
            while (it.hasNext()) {
                output.add(it.next());
            }
            return output;
        }
        return null;
    }
}
