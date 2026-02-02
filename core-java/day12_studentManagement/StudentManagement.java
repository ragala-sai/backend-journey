import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class StudentManagement {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            try {
                System.out.print("Enter choice: ");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1 -> addStudent();
                    case 2 -> viewStudents();
                    case 3 -> searchStudent();
                    case 4 -> deleteStudent();
                    case 5 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number");
            }
        }
    }

    static void addStudent() {
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());

            students.add(new Student(id, name, age));
            System.out.println("Student added successfully");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        students.forEach(Student::display);
    }

    static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = Integer.parseInt(sc.nextLine());

        Optional<Student> result =
                students.stream()
                        .filter(s -> s.id == id)
                        .findFirst();

        result.ifPresentOrElse(
                Student::display,
                () -> System.out.println("Student not found")
        );
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = Integer.parseInt(sc.nextLine());

        boolean removed =
                students.removeIf(s -> s.id == id);

        if (removed)
            System.out.println("Student deleted");
        else
            System.out.println("Student not found");
    }
}
