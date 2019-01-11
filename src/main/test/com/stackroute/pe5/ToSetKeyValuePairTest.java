package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ToSetKeyValuePairTest {
    ToSetKeyValuePair toSetKeyValuePair;
    @Before
    public void setUp() throws Exception {
        toSetKeyValuePair = new ToSetKeyValuePair();
    }

    @After
    public void tearDown() throws Exception {
        toSetKeyValuePair = null;
    }
    /* method to test Success case Set the key
        value
     */
    @Test
    public void toSetKeyValueSuccess() {
        Map<String,String> input = new TreeMap<String, String>();
        input.put("val1", "java");
        input.put("val2", "c++");
        Map<String,String> expectedValue = new TreeMap<>();
        expectedValue.put("val1", " ");
        expectedValue.put("val2", "java");
        assertEquals(expectedValue,toSetKeyValuePair.toSetKeyValue(input));

    }
    /* method to test failure of updation of
        key value
     */
    @Test
    public void testTwoKeyValueMethodFailure() {
        Map<String,String> input = new TreeMap<String, String>();
        input.put("val1", "java");
        input.put("val2", "c++");
        Map<String,String> expectedValue = new TreeMap<>();
        expectedValue.put("val1", " ");
        expectedValue.put("val2", "c++");
        assertNotEquals(expectedValue,toSetKeyValuePair.toSetKeyValue(input));

    }
    /* method to check when the input is null*/
    @Test
    public void testTwoKeyValueMethodNeutral() {
        Map<String,String> input = new TreeMap<String, String>();
        input.put("val1", " ");
        input.put("val2", " ");
        Map<String,String> expectedValue = new TreeMap<>();
        expectedValue.put("val1", " ");
        expectedValue.put("val2", " ");
        assertEquals(expectedValue,toSetKeyValuePair.toSetKeyValue(input));

    }

}