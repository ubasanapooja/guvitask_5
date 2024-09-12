import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example3 {
    public static void main(String[] args) {
        // Create a list of student names
        List<String> students = new ArrayList<>();
        students.add("Amy");
        students.add("Bob");
        students.add("Alice");
        students.add("Charlie");
        students.add("Adam");
        students.add("Eve");
        students.add("Aiden");
        students.add("Julia");
        students.add("Austin");
        students.add("Kate");

        // Filter students whose names start with "A"
        List<String> studentsWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Students whose names start with 'A':");
        studentsWithA.forEach(System.out::println);
    }
}
