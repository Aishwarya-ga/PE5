package com.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpdateSpecificArrayElement {
    public List<String> upSpecificElement(List<String> inputString, String keyword){
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
    public List<String> toEmptyArrayList(List<String> inputString){
        inputString.clear();

        return inputString;
    }

    public static void main(String[] args){
        UpdateSpecificArrayElement updateSpecificArrayElement = new UpdateSpecificArrayElement();
        List<String> input = new ArrayList<String>();
        input.add("apple");
        input.add("grape");
        input.add("melon");
        input.add("berry");
        System.out.println(updateSpecificArrayElement.upSpecificElement(input,"apple"));
        System.out.println(updateSpecificArrayElement.toEmptyArrayList(input));

    }

}
