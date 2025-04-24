package AssignmentPurpose.Task3.TaxableInterface;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        {
                int x = 9, y = 12;
                int a = 2, b = 4;
                boolean exp = 4/3 * (x + 34) < 9 * (3 + y * (2 + a)) / (a + b*y);
                System.out.println(exp);
            }


        {
            int x = 2, y = 5;

            int exp1 = (x * y / x);
            int exp2 = (x * (y / x));

            System.out.println(exp1);
            System.out.println(exp2);
        }

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
