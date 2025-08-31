package org.example.JavaConcept.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args){
        // List of Students
        List<Student> students = new ArrayList<>();

        // Add Elements in List
        students.add(new Student(111, "Mayank"));
        students.add(new Student(131, "Anshul"));
        students.add(new Student(121, "Solanki"));
        students.add(new Student(101, "Aggarwal"));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        Collections.sort(list);
        System.out.println("Before sorting the list");
        System.out.println(students);
        Collections.sort(students, new SortbyRoll());
        System.out.println(students);
    }


}
