package org.example.JavaConcept.Comparator;

import java.util.Comparator;

public class SortbyRoll implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollno - o2.rollno;
    }
}
