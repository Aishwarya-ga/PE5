package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTestTest {
    MainTest mainTest;
    @Before
    public void setUp() throws Exception {
        mainTest = new MainTest();
    }

    @After
    public void tearDown() throws Exception {
        mainTest = null;
    }
    /* method to test Success if there is difference
        age
     */
    @Test
    public void sortSuccessDifferAge() {

        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(new Student(505, "aishu", 20));
        expectedValue.add(new Student(809, "neetu", 22));
        expectedValue.add(new Student(101, "shalini", 24));

        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(101, "shalini", 24));
        arraylist.add(new Student(505, "aishu", 20));
        arraylist.add(new Student(809, "neetu", 22));

        assertEquals(expectedValue.toString(),mainTest.sort(arraylist).toString());

    }
    /* method to test Success if there is same
       age
    */
    @Test
    public void sortSuccessSameAge() {

        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(new Student(505, "aishu", 22));
        expectedValue.add(new Student(809, "neetu", 22));
        expectedValue.add(new Student(101, "shalini", 24));

        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(101, "shalini", 24));
        arraylist.add(new Student(505, "aishu", 22));
        arraylist.add(new Student(809, "neetu", 22));

        assertEquals(expectedValue.toString(),mainTest.sort(arraylist).toString());

    }
    /* method to test Success if there is same
      age and name
   */
    @Test
    public void sortSuccessSameAgeName() {

        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(new Student(505, "aishu", 22));
        expectedValue.add(new Student(809, "aishu", 22));
        expectedValue.add(new Student(101, "shalini", 24));

        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(101, "shalini", 24));
        arraylist.add(new Student(505, "aishu", 22));
        arraylist.add(new Student(809, "aishu", 22));

        assertEquals(expectedValue.toString(),mainTest.sort(arraylist).toString());

    }
    /* method to test failure when the arrayList
        is empty
   */
    @Test
    public void testSortFailure() {

        ArrayList<Student> expectedValue = new ArrayList<>(){};
        assertNull(mainTest.sort(expectedValue));
    }
}