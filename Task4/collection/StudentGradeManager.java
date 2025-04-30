package StudentManagementSysem.collection;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeManager {
    // HashMap to store student name and grade
    private HashMap<String, Integer> studentGrades = new HashMap<>();

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student added: " + name + " with grade " + grade);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade for " + name + " is: " + studentGrades.get(name));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Main method
    public static void main(String[] args) {
        StudentGradeManager manager = new StudentGradeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- Student Grade Menu ----");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Grade");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameAdd = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    manager.addStudent(nameAdd, grade);
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameRemove = scanner.nextLine();
                    manager.removeStudent(nameRemove);
                    break;

                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String nameDisplay = scanner.nextLine();
                    manager.displayGrade(nameDisplay);
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
