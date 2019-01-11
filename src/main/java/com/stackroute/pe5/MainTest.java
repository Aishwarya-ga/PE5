/*Write a class `Maintest` create Student class object(minimum 5)
* Add these student object into a List of type Student
* Sort the list based on their age in decreasing order, for student
* having sameage, sort based on their name.
* For students having same name and age, sort them according to their ID.
*/
package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    List<Student> studList = new ArrayList<>();
    //creating the object for StudentSorter class
   StudentSorter studentSorter = new StudentSorter();
    /*
    method to sort names
     */
    public List<Student> sort(ArrayList<Student> students){
        if(students.isEmpty()){
            return null;
        }
        Collections.sort(students,studentSorter);
        for(Student str: students){
            System.out.println(str);
        }
        return students;
    }
}
