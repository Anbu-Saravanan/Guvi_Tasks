package AssignmentPurpose.Task3.TaxableInterface;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {

        //Employee information
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID");
        int employeeID = scanner.nextInt();
        System.out.println("Enter Employee name");
        String employeeName = scanner.next();
        System.out.println("Enter Employee salary");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(employeeID,employeeName,salary);
        employee.display();
        System.out.println("Income Tax: " + employee.calcTax());

        //Products information
        System.out.println("Enter product id");
        int pid = scanner.nextInt();

        System.out.println("Enter product price");
        double price = scanner.nextDouble();

        System.out.println("Enter product quantity");
        int quantity = scanner.nextInt();

        Product product = new Product(pid,price,quantity);
        product.display();
        System.out.println("Sales Tax: " + product.calcTax());

    }
}
