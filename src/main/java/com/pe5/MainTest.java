package com.pe5;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    List<Student> studList = new ArrayList<>();
    StudentSorter studentSorter = new StudentSorter();

    public List<Student> sort(Student[]stud,int n){

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(studentSorter.compare(stud[i],stud[j])<0){
                    Student temp = stud[i];
                    stud[i] = stud[j];
                    stud[j] = temp;
                }
            }
        }
        for(int i=0;i<6;i++)
            studList.add(stud[i]);

        return studList;
    }
}
