// Author: Samuel S. Cho
// Created: Sept. 2023
// Permission to distribute, copy, and use *without* modification. No warranty given or implied.
public class Student {
    String StudentName; // student name
    int House; // integer corresponding to student's house

    // default constructor
    public Student() {
        StudentName = "He Who Must Not Be Named";
        House = -1;
    }

    // overloaded constructor
    public Student (String name, int h) {
        this.StudentName = name;
        this.House = h;
    }

    // assign a specific name to student (setter)
    public void setStudentName(String name) {
        this.StudentName = name;
    }
    // retrieve a student's name (getter)
    public String getStudentName() {
        return this.StudentName;
    }
    // assign a specific house to student (setter)
    public void setStudentHouse(int h) {
        this.House = h;
    }
    // retrieve a student's house (getter)
    public int getStudentHouse() {
        return this.House;
    }
}
