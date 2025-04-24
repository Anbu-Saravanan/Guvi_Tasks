package AssignmentPurpose.Task2.Inheritance;

public class Employee extends Person {
    private int employeeId;
    private double salary;

    Employee(){

    }

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Name: "+super.getName() );
        System.out.println("age: "+super.getAge());
        System.out.println("Employee ID: "+employeeId );
        System.out.println("Salary : "+salary );

    }


}
