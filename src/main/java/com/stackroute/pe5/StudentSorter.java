/*Create a `StudentSorter` class that implements `Comparator interface`*/
package com.stackroute.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student>{
    /*
    Here compare method of Comparator interface is overrided
     */
    @Override
    public int compare(Student student1, Student student2) {
        int flag = 0;
        if (student1.getAge() < student2.getAge())   {
            flag = 0;
        } else if (student1.getAge() > student2.getAge()){
            flag = 1;
        } else {
            if (student1.getName().compareTo(student2.getName()) > 1) {//compareTo return 0 if equals postive if 1st string is greater and negative if 1st string is lesser
                flag = 0;
            } else if (student1.getName().compareTo(student2.getName()) < 1) {
                flag = 1;
            }
            else {
                if (student1.getId() < student2.getId()) {
                    flag = 0;
                } else
                    flag = 1;
            }
        }
        return flag;
    }
}

