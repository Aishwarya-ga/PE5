/*Create a Student class that represents the following information of a
* student: id, name, and age allthe member variables should be private .
* Implement `getter and setter`
*/
package com.stackroute.pe5;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age= age;
    }
    public int getId () {
        return id;
    }
    public void setId ( int id){
        this.id = id;
    }
    public String getName () {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public int getAge () {
        return age;
    }
    public void setAge ( int age){
        if(age>=5 && age<=100) {
            this.age = age;
        }
    }
    @Override
    public String toString () {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


