import java.util.*;

// student class that represents the structure of a student object with attributes like ID, name, age, and grade.
public class Student {
    private int id;
    private String name;
    private int age;
    private int grade;
    public Student(int id, String name, int age, int grade) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }


    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
