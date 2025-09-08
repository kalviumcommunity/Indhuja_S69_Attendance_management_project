package com.school;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        c1.displayDetails();
        c2.displayDetails();
    }
}
