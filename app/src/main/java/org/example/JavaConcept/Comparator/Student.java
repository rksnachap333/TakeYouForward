package org.example.JavaConcept.Comparator;

public class Student {

    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // Method to print Student details in main()
    @Override
    public String toString() {
        return rollno + ": " + name;
    }
}
