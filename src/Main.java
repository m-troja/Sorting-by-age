import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Smith", 22),
                new Student("Adams", 18),
                new Student("Stevenson", 19)
        );

        students.sort(new AgeComparator());

        for (Student student : students) {
            System.out.println(student);

        }
    }
}