package JFS_Task2.Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("Enter Emp id ");
        int empId = scanner.nextInt();
        System.out.println("Enter Salary ");
        double salary = scanner.nextDouble();
        Employee emp1 = new Employee(name,age,empId,salary);
        emp1.display();
    }

}
