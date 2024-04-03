import java.util.*;

public class SortAlgorithm {
    public static void sortStudentsById(List<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getId));
        for (Student student : students) {
            System.out.println("Students sorted by ID:" + student);
        }
    }
}

