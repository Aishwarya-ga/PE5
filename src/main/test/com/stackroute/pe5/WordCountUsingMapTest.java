package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountUsingMapTest {
    WordCountUsingMap wordCountUsingMap;
    @Before
    public void setUp() throws Exception {
        wordCountUsingMap = new WordCountUsingMap();
    }

    @After
    public void tearDown() throws Exception {
        wordCountUsingMap = null;
    }
    /* method to test Success case to count the number
        of words
     */
    @Test
    public void toCountWordNumberSuccess() {
        Map<String,Integer> expected = new HashMap<String,Integer>() {
            {
                put("one",5);
                put("two",2);
                put("three",2);
            }
        };
        Map<String,Integer> actual = wordCountUsingMap.toCountWordNumber("one one -one___two,,three,one @three*one?two");
        assertEquals(expected,actual) ;
    }
    /* method to test failure case to count the number
        of words
     */
    @Test
    public void toCountWordNumberSuccessFailure(){
       assertNotNull(wordCountUsingMap.toCountWordNumber("$%2435213"));
    }

}