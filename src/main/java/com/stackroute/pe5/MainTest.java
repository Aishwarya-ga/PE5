/*Write a class `Maintest` create Student class object(minimum 5)
* Add these student object into a List of type Student
* Sort the list based on their age in decreasing order, for student
* having sameage, sort based on their name.
* For students having same name and age, sort them according to their ID.
*/
package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    List<Student> studList = new ArrayList<>();
    //creating the object for StudentSorter class
    StudentSorter studentSorter = new StudentSorter();
    /*
    method to sort names
     */
    public List<Student> sort(Student[]student,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                //
                if(studentSorter.compare(student[i],student[j])<1){
                    Student temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        for(int i=0;i<6;i++)
            studList.add(student[i]);

        return studList;
    }
}
