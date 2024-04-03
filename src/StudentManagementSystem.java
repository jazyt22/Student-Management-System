import java.util.*;

//Class containing methods for adding, deleting, searching by name AND id, and displaying student records, this does n.
public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }
// create new array to create student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }
// message that displays when new student is created
    public void deleteStudent(int studentId) {
        for (Iterator<Student> iterator = students.iterator(); iterator.hasNext();) {
            Student student = iterator.next(); //for loop to delete student using iterator
            if (student.getId() == studentId) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // for loop used to search student by id and name
    public void searchStudentById(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                System.out.println("Student found:");
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void searchStudentByName(String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student found:");
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the database.");
        } else {
            System.out.println("All students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void SortAlgorithm() {
        SortAlgorithm.sortStudentsById(students);
    }
}
