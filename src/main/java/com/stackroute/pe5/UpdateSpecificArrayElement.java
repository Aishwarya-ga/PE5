/*Write a Java program to update specific array element by given element and empty the  array list
*        Input: [Apple, Grape, Melon, Berry]
*        Output: [Kiwi, Grape, Mango, Berry]
*        Array list  after removing all elements []*/
package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;

public class UpdateSpecificArrayElement {
    /*
    method to update specific element in array
     */
    public List<String> updateSpecificElement(List<String> inputString, String keyword){
        if(!(inputString.isEmpty())) {
            List<String> string = new ArrayList<>();
            for (int i = 0; i < inputString.size(); i++) {
                if (inputString.get(i).contains(keyword)) {
                    inputString.set(i, "kiwi");
                } else if (inputString.get(i).contains("melon")) {
                    inputString.set(i, "mango");
                }
            }
            return inputString;
        }
        return null;
    }
    /*
    method to empty the arrayList
     */
    public List<String> toEmptyArrayList(List<String> inputString){
        inputString.clear();
        return inputString;
    }

}
