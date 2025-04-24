package AssignmentPurpose.Task3.TaxableInterface;

public class Employee implements Taxable{
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
    public Employee() {
    }

    @Override
    public double calcTax() {
        double yearlySalary = salary * 12;
        return  yearlySalary * incomeTax  / 100;
    }

    //Optional for printing data to test
    public void display(){
        System.out.println("Employee id is "+employeeId);
        System.out.println("Employee name is "+  name);
        System.out.println("Employee salary is "+ salary);
    }
}
