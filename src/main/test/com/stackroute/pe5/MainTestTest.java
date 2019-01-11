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

    @Test
    public void sortSuccess() {
        Student[] students = new Student[6];
        students[0] = new Student(1, "aishu", 19);
        students[1]= new Student(2 ,"neetu", 29);
        students[2] = new Student(4, "shalini", 19);
        students[3] = new Student(3, "komal", 55);
        students[4] = new Student(7, "hima", 28);
        students[5] = new Student(10, "meghana", 20);

        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(new Student(3, "komal", 55));
        expectedValue.add(new Student(2, "neetu", 29));
        expectedValue.add(new Student(7, "hima", 28));
        expectedValue.add(new Student(10, "meghana", 20));
        expectedValue.add(new Student(1, "aishu", 19));
        expectedValue.add(new Student(4, "shalini", 19));

        assertEquals(expectedValue.toString(),mainTest.sort(students,6).toString());

    }
    @Test
    public void testSortFailure() {
        Student[] s = new Student[6];
        s[0] = new Student(1, "aishu", 19);
        s[1]= new Student(2 ,"neetu", 29);
        s[2] = new Student(4, "shalini", 19);
        s[3] = new Student(3, "komal", 55);
        s[4] = new Student(7, "hima", 28);
        s[5] = new Student(10, "meghana", 20);

        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(new Student(3, "komal", 55));
        expectedValue.add(new Student(2, "neetu", 29));
        expectedValue.add(new Student(7, "hima", 28));
        expectedValue.add(new Student(10, "meghana", 20));
        expectedValue.add(new Student(1, "aishu", 19));
        expectedValue.add(new Student(7, "shalini", 19));

        assertNotEquals(expectedValue.toString(),mainTest.sort(s,6).toString());
    }
}