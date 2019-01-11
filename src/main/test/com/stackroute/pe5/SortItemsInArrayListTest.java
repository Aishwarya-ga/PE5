package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortItemsInArrayListTest {
    SortItemsInArrayList sortItemsInArrayList;
    @Before
    public void setUp() throws Exception {
        sortItemsInArrayList = new SortItemsInArrayList();
    }

    @After
    public void tearDown() throws Exception {
        sortItemsInArrayList = null;
    }
    /* method to test Success
     */
    @Test
    public void toSortArrayListSuccess() {
        ArrayList<String> expected = new ArrayList<String>() {
            {
                add("Alice");
                add("Bluto");
                add("Eugene");
                add("Henry");
                add("Olive");
            }
        };
        String[] input = {"Henry","Olive","Alice","Bluto","Eugene"};
        ArrayList<String> actual = sortItemsInArrayList.toSortArrayList(input);
        assertEquals(expected,actual);
    }
    /* method to test failure*/
    @Test
    public void toSortArrayListFailure(){
        ArrayList<String> expected = null;
        String[] input = {};
        ArrayList<String> actual = sortItemsInArrayList.toSortArrayList(input);
    }


}