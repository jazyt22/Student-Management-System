import java.util.*;
//Main function where user can choose what actions to do
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem(); // sms is abbreviation for Student Management System

        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Student"); // add student to management system
            System.out.println("2. Delete Student"); // delete student from management system
            System.out.println("3. Search Student by ID"); // search student by id in management system
            System.out.println("4. Search Student by Name"); // search student by name in management system
            System.out.println("5. Display All Students"); // display all students
            System.out.println("6. Sort Students by ID"); // using SortingAlgorithm sort students by id
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // if user presses 1 so user is prompted to create a new student
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter student name: ");
                    scanner.nextLine(); // Consume newline character
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter student grade(1-12): ");
                    int grade = scanner.nextInt();
                    Student newStudent = new Student(id, name, age, grade);
                    sms.addStudent(newStudent); //sms will be called for each option user presses, so it can use the functions in the StudentManagementSystem
                    break;
                case 2:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    sms.deleteStudent(deleteId);
                    break;
                case 3:
                    System.out.print("Enter student ID to search: ");
                    int searchId = scanner.nextInt();
                    sms.searchStudentById(searchId);
                    break;
                case 4:
                    System.out.print("Enter student name to search: ");
                    scanner.nextLine(); // Consume newline character
                    String searchName = scanner.nextLine();
                    sms.searchStudentByName(searchName);
                    break;
                case 5:
                    sms.displayAllStudents();
                    break;
                case 6:
                    sms.SortAlgorithm();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);
    }
}

