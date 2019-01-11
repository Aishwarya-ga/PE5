package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateSpecificArrayElementTest {
    UpdateSpecificArrayElement updateSpecificArrayElement;
    @Before
    public void setUp() throws Exception {
        updateSpecificArrayElement = new UpdateSpecificArrayElement();
    }

    @After
    public void tearDown() throws Exception {
        updateSpecificArrayElement = null;
    }
    /* method to test Success case to update specific
        element in the array
     */
    @Test
    public void upSpecificElementSuccess() {
        List<String> expected = new ArrayList<>() {
            {
              add("kiwi");
              add("grape");
              add("mango");
              add("berry");
            }
        };
        List<String> input = new ArrayList<String>();
        input.add("apple");
        input.add("grape");
        input.add("melon");
        input.add("berry");
        List<String> actual = updateSpecificArrayElement.updateSpecificElement(input,"apple");
        assertEquals(expected,actual);
    }
    /* method to test failure case to check when input
        is null
     */
    @Test
    public void upSpecificElementFailure() {
        List<String> expected = null;
        List<String> list = new ArrayList<>();
        list.add("");
        List<String> actual = updateSpecificArrayElement.updateSpecificElement(list," ");
    }
}