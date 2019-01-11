package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountBooleanUsingMapTest {
    WordCountBooleanUsingMap wordCountBooleanUsingMap;
    @Before
    public void setUp() throws Exception {
        wordCountBooleanUsingMap = new WordCountBooleanUsingMap();
    }

    @After
    public void tearDown() throws Exception {
        wordCountBooleanUsingMap = null;
    }

    @Test
    public void toReturnBooleanBasedOnCountSuccess() {
        Map<String,Boolean> expected = new HashMap<String,Boolean>() {
            {
                put("a",true);
                put("b",false);
                put("c",true);
                put("d",false);

            }
        };
        String arr[] = {"a","b","c","d","a","c","c"};
        Map<String,Boolean> actual = wordCountBooleanUsingMap.toReturnBooleanBasedOnCount(arr);
        assertEquals(expected,actual);
    }

    @Test
    public void toReturnBooleanBasedOnCountFailure(){
        String arr[] = {"$","%","^"};
        assertNotNull(wordCountBooleanUsingMap.toReturnBooleanBasedOnCount(arr));
    }

}