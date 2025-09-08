# Attendance System – Part 1, 2 & 3

---

## 📌 Part 1: Project Setup
- Minimal Java app that prints **Welcome**
- Folder structure: `src/com/school/Main.java`
- Instructions to compile & run from project root

### ⚙️ How to Build & Run (Part 1)
From the **project root**, run:

```bash
javac src/com/school/Main.java
java -cp src com.school.Main
Expected Output:
Welcome
```
--- 

## 📌 Part 2: Core Domain Modelling
- Defined Student class with studentId, name, setDetails(), and displayDetails() methods

- Defined Course class with courseId, courseName, setDetails(), and displayDetails() methods

- Used arrays of objects in Main.java to manage and display multiple students and courses

- Introduced basic usage of the this keyword

### ⚙️ How to Build & Run (Part 2)
From the project root, run:

```bash
javac src/com/school/Student.java src/com/school/Course.java src/com/school/Main.java
java -cp src com.school.Main
Expected Output:
=== Students ===
Student ID: 1, Name: Alice
Student ID: 2, Name: Bob

=== Courses ===
Course ID: 101, Name: Mathematics
Course ID: 102, Name: Science

```

--- 

## 📌 Part 3: Constructor Initialization & Auto-ID Generation
- Implemented parameterized constructors in Student and Course classes for object initialization

- Utilized private static member variables for automatic and unique ID generation

- Demonstrated the use of the this keyword in constructors

- Changed Course's courseId to int for simpler auto-generation and updated its display

- Updated Main.java to use constructors and show ID progression with multiple instances

### ⚙️ How to Build & Run (Part 3)
From the project root, run:

```bash
javac src/com/school/Student.java src/com/school/Course.java src/com/school/Main.java
java -cp src com.school.Main
Expected Output (example):

Student ID: 1, Name: Alice
Student ID: 2, Name: Bob
Student ID: 3, Name: Charlie
Course ID: C101, Course Name: Mathematics
Course ID: C102, Course Name: Science
```
---

## ✍️ Author
### Name: Indhuja E
### Squad: 69

